<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Início</title>
<link href="https://fonts.googleapis.com/css?family=Roboto:100i,300,400,500,700" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Allura" rel="stylesheet">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
  <link rel="stylesheet" href="./css/style.css">
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
            <a class="nav-link" href="./index.jsp">Home <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="./pages/personagens/personagens.jsp">Personagens</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="./pages/timeline/timeline.jsp">Linha do Tempo</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="./pages/quiz/quiz.jsp">Quiz</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="./pages/about/about.jsp">Sobre o Projeto</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="./pages/game/game.jsp">Minigame</a>
          </li>
        </ul>
      </div>
    </nav>
  </header>

  <!-----FIM DA NAVBAR / MENU SUPERIOR-->
  <div class="container-fluid">
    <main role="main" class="inner-cover text-center">
      <div class="images">
        <img class="index-img" src="./img/bttf-logo.png" alt="logo-index"></img>
      </div>
      <div class="index-buttons">
        <a href="./pages/personagens/personagens.jsp"><button type="button" class="btn btn-warning btn-lg">Personagem</button></a>
        <a href="./pages/timeline/timeline.jsp"><button type="button" class="btn btn-warning btn-lg">Timeline</button></a>
      </div>
    </main>
    <div class="background">
      <video autoplay="autoplay" loop="true" poster="../img/poster.jpg" class="bg_video" muted>
        <source src="./videos/trailer-nosound.webm" type="video/webm">
        <source src="./videos/trailer-nosound.mp4" type="video/mp4">
      </video>
    </div>
  </div>


  <!-- partial -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
  <script src='https://cdn.jsdelivr.net/scrollreveal.js/3.3.1/scrollreveal.min.js'></script>
  <script src="./js/script.js"></script>
</body>
</html>