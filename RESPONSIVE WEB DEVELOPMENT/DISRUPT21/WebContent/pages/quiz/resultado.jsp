<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ranking</title>
<link href="https://fonts.googleapis.com/css?family=Roboto:100i,300,400,500,700" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Allura" rel="stylesheet">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/FiapHopp/DSRPT21@main/RESPONSIVE%20WEB%20DEVELOPMENT/DISRUPT21/WebContent/css/style.css">
  <link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css'>


</head>
<body class="bg-dark">


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
            <a class="nav-link" data-toggle="modal" data-target="#gameModal"  href="../game/game.jsp">Minigame</a>
          </li>
        </ul>
      </div>
    </nav>
</header>

<center><h2 class="container text-light">Parabéns, você acertou ${qtde_acertos}/5</h2></center>
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="quizModalLabel">Cadastre-se para pontuar no ranking!</h5>
        </div>
        <div class="modal-body">
          <form action="/DISRUPT21/cadastrarUsuario" method="post">
            <div class="form-group">
              <label for="recipient-name" class="col-form-label">Nome:</label>
              <input type="text" class="form-control" id="nome-usuario" name="txtNome">
            </div>
            <div class="form-group">
              <label for="message-text" class="col-form-label">E-mail:</label>
              <input type="text" class="form-control" id="email-usuario" name="txtemail">
            </div>
          
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-primary">Enviar</button>
        </div>
        </form>
      </div>
    </div>



</body>

</html>