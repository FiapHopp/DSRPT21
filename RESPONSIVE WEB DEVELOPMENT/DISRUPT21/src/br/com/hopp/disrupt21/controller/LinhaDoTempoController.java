package br.com.hopp.disrupt21.controller;

import java.io.IOException;

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
				listaLinhaDoTempo(request, response);
				break;
			case "/listar":
				
				break;
			default:
				System.out.println("ENTROU default");
		}

	}
	

	private void listaLinhaDoTempo(HttpServletRequest req, HttpServletResponse resp) {
		
		try {
			resp.sendRedirect("/DISRUPT21/pages/timeline/timeline.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
