<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Timeline</title>
<link href="https://fonts.googleapis.com/css?family=Roboto:100i,300,400,500,700" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Allura" rel="stylesheet">
  <link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css'>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/FiapHopp/DSRPT21@main/RESPONSIVE%20WEB%20DEVELOPMENT/DISRUPT21/WebContent/css/style.css">
</head>

<body class="bg-timeline">
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
            <a class="nav-link" href="/DISRUPT21/personagens">Personagens</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/DISRUPT21/linhaDoTempo">Linha do Tempo</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/DISRUPT21/quiz">Quiz</a>
          </li>
                    <li class="nav-item">
            <a class="nav-link" href="/DISRUPT21/ranking">Ranking Quiz</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="./pages/about/about.jsp">Sobre o Projeto</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" data-toggle="modal" data-target="#gameModal" href="./pages/game/game.jsp">Minigame</a>
          </li>
        </ul>
      </div>
    </nav>
  </header>

  <section class="timeline">
    <div class="container-fluid">

    <c:forEach var="timeline" items="${lista_linhaTempo}" varStatus="id">
      <div class="timeline-item">
        <div class="timeline-img"></div>

        <div class="timeline-content js--fadeInLeft">
          <h2>${timeline.titulo}</h2>
          <div class="date">${timeline.anoAcontecimento}</div>
            <p>${timeline.resumo}</p>
            <button type="button" class="btn btn-warning" href="javascript:void(0)" data-toggle="modal" data-target="#modal_${id.count}">
			  Saiba mais
			</button>
        </div>
      </div>

      </c:forEach>
    </div>
  </section>
  <!-- partial -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
  <script src='https://cdn.jsdelivr.net/scrollreveal.js/3.3.1/scrollreveal.min.js'></script>
  <script src="./js/script.js"></script>

</body>

<c:forEach var="timeline" items="${lista_linhaTempo}" varStatus="id">
<div class="modal fade" id="modal_${id.count}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">${timeline.titulo}</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        ${timeline.acontecimento}
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
      </div>
    </div>
  </div>
</div>
</c:forEach>

<!-- Modal Game -->
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
              <a href="../game/game.jsp"><button type="button" class="btn btn-success">Acessar</button></a>
          </div>
      </div>
  </div>
</div>

</html>
