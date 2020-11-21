package br.com.hopp.disrupt21.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.hopp.disrupt21.bo.LinhaDoTempoBo;
import br.com.hopp.disrupt21.bo.RankingBo;
import br.com.hopp.disrupt21.to.LinhaDoTempoTo;
import br.com.hopp.disrupt21.to.RankingTo;

/**
 * Servlet implementation class RankingController
 */
@WebServlet("/ranking")
public class RankingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RankingController() {
        super();

    }

    protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		switch (request.getRequestURI()) {

			case "/DISRUPT21/ranking":	
				try {
					ranking(request, response);
				} catch (Exception e) {

					e.printStackTrace();
				}				
				break;
			
			default:			
				response.sendRedirect("/DISRUPT21/pages/erro/erro.jsp?msgStatus=Pagina não encontrada");
		}

	}
	
	// MONTA TODOS AS INFORMACOES QUE A TIMELINE.JSP PRECISA E DEPOIS REDIRECIONA
	private void ranking(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		RankingBo rankingBo = new RankingBo();

		List<RankingTo> listaRanking = rankingBo.lista();
		
		
		if(listaRanking.isEmpty()) {
			response.sendRedirect("/DISRUPT21/pages/erro/erro.jsp?msgStatus=Nenhuma linha do tempo encontrada.");
			
		}else {
			request.setAttribute("lista_ranking", listaRanking);
			request.getRequestDispatcher("/pages/quiz/ranking.jsp").forward(request, response);
			
		}
		
							
	}

}
