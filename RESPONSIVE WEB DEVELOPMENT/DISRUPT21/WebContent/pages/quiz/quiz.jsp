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
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/FiapHopp/DSRPT21@main/RESPONSIVE%20WEB%20DEVELOPMENT/DISRUPT21/WebContent/css/style.css">
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/FiapHopp/DSRPT21@main/RESPONSIVE%20WEB%20DEVELOPMENT/DISRUPT21/WebContent/css/quiz.css">
</head>

<body>
  <header class="text-center mb-5">
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
            <a class="nav-link" href="../personagens/personagens.jsp">Personagens</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="../timeline/timeline.jsp">Linha do Tempo</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="../quiz/quiz.jsp">Quiz</a>
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
<div class="container mt-5">        
                                               
	 <c:forEach var="quiz" items="${lista_quiz}" varStatus="id">
		<div class="form-group">
	    	<label for="exampleFormControlSelect1" class="text-light">${quiz.pergunta}</label>
		    <select class="form-control" id="exampleFormControlSelect1">
		      <option value="">Selecione a resposta</option>
		      <option value="${quiz.resposta1}">${quiz.resposta1}</option>
		      <option value="${quiz.resposta2}">${quiz.resposta2}</option>
		      <option value="${quiz.resposta3}">${quiz.resposta3}</option>
		      <option value="${quiz.resposta4}">${quiz.resposta4}</option>
		      <option value="${quiz.resposta5}">${quiz.resposta5}</option>
		    </select>
		</div>	               
	 </c:forEach>
                
</div>

 
  <!-- partial -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
  <script src='https://cdn.jsdelivr.net/scrollreveal.js/3.3.1/scrollreveal.min.js'></script>
  <script src="../../js/script.js"></script>

</body>
</html>