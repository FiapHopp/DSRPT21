//variáveis do jogo
var canvas, ctx, ALTURA, LARGURA, VELOCIDADE = 8,
    maxPulos = 3,
    estadoAtual, record, img,

    pontosParaNovaFase = [5, 10, 15, 20],
    faseAtual = 0,

    labelNovaFase = {
        texto: "",
        opacidade: 0.0,

        fadeIn: function(dt) {
            var fadeInId = setInterval(function() {
                if (labelNovaFase.opacidade < 1.0)
                    labelNovaFase.opacidade += 0.01;

                else {
                    clearInterval(fadeInId);
                }
            }, 10 * dt);
        },

        fadeOut: function(dt) {
            var fadeOutId = setInterval(function() {
                if (labelNovaFase.opacidade > 0.0)
                    labelNovaFase.opacidade -= 0.01;

                else {
                    clearInterval(fadeOutId);
                }
            }, 10 * dt);
        }
    },

    estados = {
        jogar: 0,
        jogando: 1,
        perdeu: 2
    },

    chao = {
        y: 550,
        x: 0,
        altura: 50,

        atualiza: function() {
            this.x -= VELOCIDADE;

            if (this.x <= -30)
                this.x += 30;
        },

        desenha: function() {
            spriteChao.desenha(this.x, this.y);
            spriteChao.desenha(this.x + spriteChao.largura, this.y);
        }
    },

    bloco = {
        x: 50,
        y: 0,
        altura: spriteBoneco.altura,
        largura: spriteBoneco.largura,
        gravidade: 1.6,
        velocidade: 0,
        forcaDoPulo: 25,
        qntPulos: 0,
        score: 0,
        rotacao: 0,

        vidas: 3,
        colidindo: false,

        atualiza: function() {
            this.velocidade += this.gravidade;
            this.y += this.velocidade;
            //this.rotacao += Math.PI / 180 * VELOCIDADE;

            if (this.y > chao.y - this.altura && estadoAtual != estados.perdeu) {
                this.y = chao.y - this.altura;
                this.qntPulos = 0;
                this.velocidade = 0;
            }
        },

        pula: function() {
            if (this.qntPulos < maxPulos) {
                this.velocidade = -this.forcaDoPulo;
                this.qntPulos++;
            }
        },

        reset: function() {
            this.velocidade = 0;
            this.y = 0;
            if (this.score > record) {
                record = this.score;
                localStorage.setItem("record", this.score);
            }

            this.vidas = 3;
            this.score = 0;

            VELOCIDADE = 6;
            faseAtual = 0;
            this.gravidade = 1.6;

        },

        desenha: function() {
            ctx.save();
            ctx.translate(this.x + this.largura / 2, this.y + this.altura / 2);
            ctx.rotate(this.rotacao);
            spriteBoneco.desenha(-this.largura / 2, -this.altura / 2);
            ctx.restore();
        }
    },

    obstaculos = {
        _obs: [],
        _scored: false,
        _sprites: [inimigo1, inimigo2, inimigo3, inimigo4, inimigo5, inimigo6, inimigo7, inimigo8, inimigo9, inimigo10],
        timerInsere: 0,
        //index: Math.floor(Math.random() * 10),

        //descobrir como usa a altura do sprint
        insere: function() {
            indexF = Math.floor(Math.random() * 10),
                this._obs.push({
                    x: LARGURA,
                    //largura: 50 + Math.floor(10 * Math.random()),
                    largura: 50,
                    index: this._sprites[Math.floor(this._sprites.length * Math.random())],
                    sprite: this._sprites[indexF],
                    //sprite: this._sprites[this.i],
                    y: chao.y - this._sprites[indexF].altura //Math.floor(20 + Math.random() * 100),//this._sprites.length + 380,
                });
            /*
                      if (bloco.score < 10) {
              
                      }
                      else if (bloco.score < 20) {
              
                      }
              
                      else if (bloco.score < 30) {
              
                      }
              
                      else if (bloco.score < 40) {
              
                      }
                      else {
              
                      }
            */
            this.timerInsere = 50 + Math.floor(100 * Math.random());
        },

        atualiza: function() {
            if (this.timerInsere == 0)
                this.insere();

            else
                this.timerInsere--;

            for (var i = 0, tam = this._obs.length; i < tam; i++) {
                var obj = this._obs[i];
                obj.x -= VELOCIDADE;

                if (!bloco.colidindo && obj.x <= bloco.x + bloco.largura &&
                    bloco.x <= obj.x + obj.largura &&
                    obj.y <= bloco.y + bloco.altura) {

                    bloco.colidindo = true

                    setTimeout(function() {
                        bloco.colidindo = false;
                    }, 500);

                    if (bloco.vidas >= 1)
                        bloco.vidas--;

                    else {
                        estadoAtual = estados.perdeu
                    }
                } else if (obj.x <= 0 && !obj._scored) {
                    bloco.score++;
                    obj._scored = true;

                    if (faseAtual < pontosParaNovaFase.length &&
                        bloco.score == pontosParaNovaFase[faseAtual])
                        passarDeFase();
                } else if (obj.x <= -obj.largura) {
                    this._obs.splice(i, 1);
                    tam--;
                    i--;
                }
            }
        },

        limpa: function() {
            this._obs = [];
        },

        desenha: function() {
            for (var i = 0, tam = this._obs.length; i < tam; i++) {
                var obj = this._obs[i];

                obj.sprite.desenha(obj.x, obj.y);
            }
        }
    };

function clique(event) {
    if (estadoAtual == estados.jogar) {
        estadoAtual = estados.jogando;
        frames = 0;
    } else if (estadoAtual == estados.perdeu && bloco.y >= 2 * ALTURA) {
        estadoAtual = estados.jogar;
        obstaculos.limpa();
        bloco.reset();
    } else if (estadoAtual == estados.jogando)
        bloco.pula();
}

function passarDeFase() {
    faseAtual++;
    bloco.vidas++;
    if (bloco.score < 10) {
        VELOCIDADE++;
    } else if (bloco.score < 20) {
        VELOCIDADE++;
    } else if (bloco.score < 30) {
        VELOCIDADE++;
    } else if (bloco.score < 40) {
        VELOCIDADE++;
    } else if (bloco.score < 50) {
        VELOCIDADE++;
    } else if (bloco.score < 60) {
        VELOCIDADE++;
    } else if (bloco.score < 70) {
        VELOCIDADE++;
    } else {
        VELOCIDADE++;
    }
    if (faseAtual == 4)
        bloco.gravidade *= 0.6;

    labelNovaFase.texto = "Level " + faseAtual;
    labelNovaFase.fadeIn(0.4);

    setTimeout(function() {
        labelNovaFase.fadeOut(0.4);
    }, 800);
}

function main() {
    ALTURA = window.innerHeight;
    LARGURA = window.innerWidth;

    if (LARGURA >= 500) {
        LARGURA = 900;
        ALTURA = 600;
    }


    canvas = document.createElement("canvas");
    canvas.width = LARGURA;
    canvas.height = ALTURA;
    canvas.style.border = "1px solid #000";
    canvas.id = "bttf-game";

    ctx = canvas.getContext("2d");
    document.body.appendChild(canvas);

    document.addEventListener("mousedown", clique);
    document.addEventListener("keyup", clique);

    estadoAtual = estados.jogar;

    record = localStorage.getItem("record");

    if (record == null)
        record = 0;

    img = new Image();
    img.src = "../../img/game/sheet.png";

    roda();
}

function roda() {
    atualiza();
    desenha();

    window.requestAnimationFrame(roda);
}

function atualiza() {
    if (estadoAtual == estados.jogando)
        obstaculos.atualiza();

    chao.atualiza();
    bloco.atualiza();
}

function desenha() {
    bg.desenha(0, 0);

    ctx.fillStyle = "#fff";
    ctx.font = "50px Arial";
    ctx.fillText('Score: ' + bloco.score, 30, 68);
    ctx.fillText('Vidas: ' + bloco.vidas, 540, 68);

    ctx.fillStyle = "rgba(0, 0, 0, " + labelNovaFase.opacidade + ")";
    ctx.fillText(labelNovaFase.texto, canvas.width / 2 - ctx.measureText(labelNovaFase.texto).width / 2, canvas.height / 3);

    if (estadoAtual == estados.jogando)
        obstaculos.desenha();

    chao.desenha();
    bloco.desenha();

    if (estadoAtual == estados.jogar)
        jogar.desenha(LARGURA / 2 - jogar.largura / 2, ALTURA / 2 - jogar.altura / 2);

    if (estadoAtual == estados.perdeu) {
        perdeu.desenha(LARGURA / 2 - perdeu.largura / 2, ALTURA / 2 - perdeu.altura / 2 - spriteRecord.altura / 2);

        spriteRecord.desenha(LARGURA / 2 - spriteRecord.largura / 2, ALTURA / 2 + perdeu.altura / 2 - spriteRecord.altura / 2 - 25);

        ctx.fillStyle = "#fff";
        ctx.fillText('Pontuação: ' + bloco.score, LARGURA / 2 - 140, 390);

        if (bloco.score > record) {
            novo.desenha(LARGURA / 2 - 180, ALTURA / 2 + 30);
            ctx.fillText(bloco.score, 420, 470);
        } else
            ctx.fillStyle = "#000000";
        ctx.fillText(record, LARGURA / 2, 540);
    }
}

//inicializa o jogo
main();