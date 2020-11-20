<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About</title>
    <link href="https://fonts.googleapis.com/css?family=Roboto:100i,300,400,500,700" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Allura" rel="stylesheet">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/FiapHopp/DSRPT21@main/RESPONSIVE%20WEB%20DEVELOPMENT/DISRUPT21/WebContent/css/style.css">
</head>
<body>
    
  <header class="text-center">
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <button class="navbar-toggler collapsed" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
        <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
          <li class="nav-item active">
            <a class="nav-link" href="../../index.jsp">Home <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/DISRUPT21/personagens">Personagens</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/DISRUPT21/linhaDoTempo">Linha do Tempo</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/DISRUPT21/quiz">Quiz</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="../about/about.jsp">Sobre o Projeto</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" data-toggle="modal" data-target="#gameModal" href="../game/game.jsp">Minigame</a>
          </li>
        </ul>
      </div>
    </nav>
</header>

<div class="container-fluid">
        <div class="row justify-content-start">
            <div class=" col-2 justify-content-center">
                <img class="fiap-shape" src="../../img/bttf-shape.png" alt="FIAP Shape"></img>
            </div>
            <div class="hoverboard-text col-8 ml-md-auto justify-content-center text-light">
                <h2>Disrupção.</h2><br>
                <p class="fiap-text">
                    O desafio proposto pela FIAP teve como seu principal foco, como seu nome sugere a disrupção. Essa que é colocada em prática não apenas produzindo produtos diferentes do que se é visto, mas também se colocando em padrões diferentes do habitual, inovar
                    em suas próprias competências e habilidades se desafiando a criar algo tendo uma nova experiência. E foi assim que tivemos a ideia de homenagear a FIAP idealizando a sua premiação clássica trazendo ela para o tema proposto, dois clássicos
                    inovadores em um só.
                </p>
            </div>
            <div class=" col-2 justify-content-center">
                <img class="fiap-shape" src="../../img/fiap-shape.png" alt="FIAP Shape"></img>
            </div>
        </div>
        <div class="hoverboard col-xs-12 col-md-4 ">
            <div class="sketchfab-embed-wrapper">
                <iframe title="A 3D model" width="640" height="480" src="https://sketchfab.com/models/0bc7a20879884f37bf3cd901b4358414/embed?autospin=0.2&amp;autostart=1&amp;camera=0&amp;preload=1&amp;ui_controls=1&amp;ui_infos=1&amp;ui_inspector=1&amp;ui_stop=1&amp;ui_watermark=0&amp;ui_watermark_link=1"
                    frameborder="0" allow="autoplay; fullscreen; vr" mozallowfullscreen="true" webkitallowfullscreen="true"></iframe>
            </div>
        </div>
    </div>


  <!-- Plugins -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
  <script src="../../js/bootstrap.js"></script>
  <script src='https://cdn.jsdelivr.net/scrollreveal.js/3.3.1/scrollreveal.min.js'></script>
  <script src="../../js/script.js"></script>


</body>
<div class="modal fade" id="gameModal" tabindex="-1" role="dialog" aria-labelledby="gameModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="gameModalLabel">Time Travel</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
            </div>
            <div class="modal-body">
                Para acessar a tela desejada será necessário uma viagem ao passado. Deseja continuar?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <a href="./pages/game/game.jsp"><button type="button" class="btn btn-success">Acessar</button></a>
            </div>
        </div>
    </div>
</div>
</html>