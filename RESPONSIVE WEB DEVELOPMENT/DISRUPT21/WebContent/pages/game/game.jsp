<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Game</title>
<link href="https://fonts.googleapis.com/css?family=Allura"
	rel="stylesheet">
<link rel='stylesheet' href='../../css/bootstrap.css'>
<link rel="stylesheet" href="../../css/retro-style.css">
<style>
canvas {
	position: absolute;
	top: 0px;
	bottom: 0px;
	left: 0px;
	right: 0px;
	margin: auto;
}
</style>
</head>

<body>
	<header class="text-center">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<button class="navbar-toggler collapsed" type="button"
				data-toggle="collapse" data-target="#navbarTogglerDemo01"
				aria-controls="navbarTogglerDemo01" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarTogglerDemo01">
				<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
					<li class="nav-item active"><a class="nav-link" data-toggle="modal" data-target="#retroModal"
						href="../../index.jsp">Home <span class="sr-only">(current)</span></a>
					</li>
					<li class="nav-item"><a class="nav-link" data-toggle="modal" data-target="#retroModal"
						href="../personagens/personagens.jsp">Personagens</a></li>
					<li class="nav-item"><a class="nav-link" data-toggle="modal" data-target="#retroModal"
						href="../timeline/timeline.jsp">Linha do Tempo</a></li>
					<li class="nav-item"><a class="nav-link" data-toggle="modal" data-target="#retroModal"
						href="../quiz/quiz.jsp">Quiz</a></li>
					<li class="nav-item"><a class="nav-link" data-toggle="modal" data-target="#retroModal"
						href="../about/about.jsp">Sobre o Projeto</a></li>
					<li class="nav-item"><a class="nav-link" data-toggle="modal" data-target="#retroModal"
						href="../game/game.jsp">Minigame</a></li>
				</ul>
			</div>
		</nav>
	</header>
    <div class="container-fluid">
        <div class="game-content">
            <div class="game-text">
                <img src="../../img/bttf-logo.png" alt="Back To The Future Logo" class="bttf-logo">
                <img src="../../img/retro/delorean.gif" alt="Delorean Animation" class="delorean-gif">
                <div class="img-awards">
                    <img src="../../img/retro/yahooweek.gif" alt="Yahoo Pick Of The Week">
                    <img src="../../img/retro/community.gif" alt="Web Comunity Development Award">
                </div>
            </div>
            <div class="game">
                <script>
                    main();
                </script>
                <canvas id="bttf-game"></canvas>
            </div>
            <div class="game-instruction">
                <img src="../../img/retro/mouse-hand.png" alt="Clique com botão esquerdo"> ou <img src="../../img/retro/key.jpg" alt="Qualquer tecla"> - Para jogar é só clicar no jogo, e após o início você pode clicar para pular, ou apertar alguma tecla.
            </div>
        </div>
        <div class="ads">
            <img src="../../img/retro/ie_logo.gif" alt="IE Retro Logo">
            <img src="../../img/retro/ns_logo.gif" alt="Netscape Retro Logo">
            <img src="../../img/retro/notepad.gif" alt="Notepad">
            <img src="../../img/retro/noframes.gif" alt="No frames">

        </div>

        <div class="footer">
            <img src="../../img//retro/geocities.jpg" alt="Yahoo Geocities">
            <img src="../../img/retro/counter.gif" alt="Contador">
            <img src="../../img/retro/fiap-retro.jpg" id="fiap-retro" alt="FIAP Logo Retro">
        </div>
    </div>



	<!-- Plugins -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script src="../../js/bootstrap.js"></script>
	<script
		src='https://cdn.jsdelivr.net/scrollreveal.js/3.3.1/scrollreveal.min.js'></script>
	<script src="../../js/script.js"></script>
	<script src="../../js/Sprite.js"></script>
	<script src="../../js/game.js"></script>

</body>
<div class="modal" id="retroModal" tabindex="-1" role="dialog" aria-labelledby="gameModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="gameModalLabel">Time Travel</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">X</span>
        </button>
            </div>
            <div class="modal-body">
                Deseja voltar para
                <p id="dataDia"></p>?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary " data-dismiss="modal">Close</button>
                <a href="../../index.jsp"><button type="button" class="btn btn-primary border-dark">Acessar</button></a>
            </div>
        </div>
    </div>
</div>
</html>