function Sprite(x, y, largura, altura) {
	this.x = x;
	this.y = y;
	this.largura = largura;
	this.altura = altura;

	this.desenha = function (xCanvas, yCanvas) {
		ctx.drawImage(img, this.x, this.y, this.largura, this.altura, xCanvas, yCanvas, this.largura, this.altura);
	}
}


var bg = new Sprite(0, 0, 3000, 600),
	spriteBoneco = new Sprite(5, 770, 120, 130),

	perdeu = new Sprite(10, 1690, 739, 358),
	jogar = new Sprite(0, 1275, 420, 210),
	novo = new Sprite(20, 2120, 250, 70),
	spriteRecord = new Sprite(0, 2250, 350, 70),
	spriteChao = new Sprite(0, 604, 3000, 54),

	//inimigos

	inimigo1 = new Sprite(13, 1013, 200, 125),
	inimigo2 = new Sprite(250, 1000, 200, 160),
	inimigo3 = new Sprite(495, 1000, 150, 155),
	inimigo4 = new Sprite(678, 1000, 150, 160),
	inimigo5 = new Sprite(850, 1000, 150, 160),
	inimigo6 = new Sprite(1020, 1010, 160, 155),
	inimigo7 = new Sprite(1200, 1000, 160, 170),
	inimigo8 = new Sprite(1421, 1070, 100, 85),
	inimigo9 = new Sprite(1545, 1070, 95, 85),
	inimigo10 = new Sprite(1655, 1070, 50, 70);