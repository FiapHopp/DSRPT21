package br.com.hopp.disrupt21.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet(urlPatterns= {"/listaAll","/listar"})
public class LinhaDoTempoController extends HttpServlet {
	
	private static final long serialVersionUID= 1L;
	
	public LinhaDoTempoController() {
		super();
	}
	
	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		switch(request.getRequestURI()) {
		case "/listaAll":
			listaLinhaDoTempo(request,response);
			break;
		case "/listar":
			try {
				pesquisarLinhaDoTempo(request,response,Integer.parseInt(request.getParameter("")));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			response.sendRedirect("");
		}
		
	}

	private void pesquisarLinhaDoTempo(HttpServletRequest req, HttpServletResponse resp, int idTempo) throws Exception{
		
		
	}

	private void listaLinhaDoTempo(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}
	
}
