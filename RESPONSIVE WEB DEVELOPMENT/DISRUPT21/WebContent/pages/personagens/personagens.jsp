<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Personagens</title>
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
            <a class="nav-link" href="../game/game.jsp">Minigame</a>
          </li>
        </ul>
      </div>
    </nav>
</header>

<!-----FIM DA NAVBAR / MENU SUPERIOR-->
<section class="personagem-tabs">
  <img src="./img/personagens-cover.jpg" class="personagem-cover">
  <div class="personagem-tabs-container">
  <c:forEach var="list" items="${lista_personagens}" varStatus="id">
    <a class="personagem-tab" href="#tab-${list.id}">${list.nomePersonagem}</a>
    </c:forEach>		
    <span class="personagem-tab-slider"></span>
  </div>
</section>

<!-- Main -->
<main class="personagem-main">
<c:forEach var="list" items="${lista_personagens}" varStatus="id">
  <section class="personagem-slide" id="tab-${list.id}">
      <div class="row">
          <div class="col-md-6 col-xs-6 personagem-texto text-light">
              <h1>${list.nomePersonagem}</h1>
              <h3>Sobre:</h3>
              <p>${list.resumo}</p>
              
          </div>
          <div class="col-md-6 col-xs-6 text-light personagem-imagem">
              <div class="image-slider1">
                  <div><img src="./img/personagens/${list.imgPass}" /></div>
                  <img src="./img/personagens/${list.imgPres}" />
              </div>
          </div>
      </div>
    </section>
    </c:forEach>
</main>

<!-- partial -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
<script src='https://cdn.jsdelivr.net/scrollreveal.js/3.3.1/scrollreveal.min.js'></script>
<script src="../../js/script.js"></script>
</body>
</html>