package br.com.hopp.disrupt21.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import br.com.hopp.disrupt21.bo.LinhaDoTempoBo;
import br.com.hopp.disrupt21.to.LinhaDoTempoTo;

@WebServlet(urlPatterns = { "/linhaDoTempo" })
public class LinhaDoTempoController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public LinhaDoTempoController() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		switch (request.getRequestURI()) {

			case "/DISRUPT21/linhaDoTempo":	
				try {
					listaLinhaDoTempo(request, response);
				} catch (Exception e) {

					e.printStackTrace();
				}				
				break;
			
			default:			
				response.sendRedirect("/DISRUPT21/pages/erro/erro.jsp?msgStatus=Pagina não encontrada");
		}

	}
	
	// MONTA TODOS AS INFORMACOES QUE A TIMELINE.JSP PRECISA E DEPOIS REDIRECIONA
	private void listaLinhaDoTempo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		try {
			response.sendRedirect("/DISRUPT21/pages/timeline/timeline.jsp");

			LinhaDoTempoBo linhaTempoBo = new LinhaDoTempoBo();

			List<LinhaDoTempoTo> listaLinhaTempo = linhaTempoBo.lista();

			if (listaLinhaTempo != null) {

				request.setAttribute("lista_linhaTempo", listaLinhaTempo);

				request.getRequestDispatcher("/DISRUPT21/pages/timeline/timeline.jsp").forward(request, response);

			} else {

				response.sendRedirect("/DISRUPT21/pages/erro/erro.jsp?msgStatus=Nenhuma linha do tempo encontrada");
			}

		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
