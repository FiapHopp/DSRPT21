<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz</title>
<link href="https://fonts.googleapis.com/css?family=Roboto:100i,300,400,500,700" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Allura" rel="stylesheet">
  <link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css'>
  <link rel="stylesheet" href="../../css/style.css">
   <link rel="stylesheet" href="../../css/quiz.css">
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
            <a class="nav-link" href="/DISRUPT21/personagens">Personagens</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/DISRUPT21/linhaDoTempo">Linha do Tempo</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/DISRUPT21/quiz">Quiz</a>
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
<div class="container mt-5">
        <div class="row"><br><br>
            <div class="col-sm-8 col-sm-offset-2">
                <div class="loader">
                    <div class="col-xs-3 col-xs-offset-5">
                        <div id="loadbar" style="display: none;">
                            <img src="https://8finatics.s3.amazonaws.com/static/reload_emi.gif" alt="Loading" class="center-block loanParamsLoader" style="">
                        </div>
                    </div>

                    <div id="quiz">
						<form action="/DISRUPT21/responder" method="post">
							<c:forEach var="list" items="${lista_quiz}" varStatus="id">
								<div class="question">
									<h3>
										<span class="label label-warning" id="qid">${id.count})</span>
										<span id="question">${list.pergunta}</span>
									</h3>
								</div>
								
								<ul>
									<li><input type="radio" id="f-option"
										name="selector${id.count}" value="${list.resposta1}">
										<label for="f-option" class="element-animation">${list.resposta1}</label>
										<div class="check"></div></li>

									<li><input type="radio" id="s-option"
										name="selector${id.count}" value="${list.resposta2}">
										<label for="s-option" class="element-animation">${list.resposta2}</label>
										<div class="check">
											<div class="inside"></div>
										</div></li>

									<li><input type="radio" id="t-option"
										name="selector${id.count}" value="${list.resposta3}">
										<label for="t-option" class="element-animation">${list.resposta3}</label>
										<div class="check">
											<div class="inside"></div>
										</div></li>
									<li><input type="radio" id="t-option"
										name="selector${id.count}" value="${list.resposta4}">
										<label for="t-option" class="element-animation">${list.resposta4}</label>
										<div class="check">
											<div class="inside"></div>
										</div></li>
									<li><input type="radio" id="t-option"
										name="selector${id.count}" value="${list.resposta5}">
										<label for="t-option" class="element-animation">${list.resposta5}</label>
										<div class="check">
											<div class="inside"></div>
										</div></li>
								</ul>
								
							</c:forEach>
							<input name="idQuiz" value="${id_quiz}" type="hidden">
							<button type="submit">Submeter</button>
						</form>
                    </div>
                </div>
                <div class="text-muted">
                    <span id="answer"></span>
                </div>

            </div>
        </div>

    </div>


  <!-- partial -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
  <script src='https://cdn.jsdelivr.net/scrollreveal.js/3.3.1/scrollreveal.min.js'></script>
  <script src="../../js/script.js"></script>
  <div class="modal fade" id="quizModal" tabindex="-1" role="dialog" aria-labelledby="quizModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="quizModalLabel">New message</h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
          <form>
            <div class="form-group">
              <label for="recipient-name" class="col-form-label">Recipient:</label>
              <input type="text" class="form-control" id="nome-usuario">
            </div>
            <div class="form-group">
              <label for="message-text" class="col-form-label">Message:</label>
              <input type="text" class="form-control" id="email-usuario">
            </div>
          </form>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
          <button type="button" class="btn btn-primary">Send message</button>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
