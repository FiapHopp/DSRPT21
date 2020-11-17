package br.com.hopp.disrupt21.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import br.com.hopp.disrupt21.bo.LinhaDoTempoBo;
import br.com.hopp.disrupt21.to.LinhaDoTempoTo;


@WebServlet(urlPatterns= {"/linhaDoTempo"})
public class LinhaDoTempoController extends HttpServlet {
	
	private static final long serialVersionUID= 1L;
	
	public LinhaDoTempoController() {
		super();
	}
	
	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		switch(request.getRequestURI()) {
		case "/DISRUPT21/listaAll":
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
			System.out.println("entrou aqui");
		}
		
	}
	
	private void pesquisarLinhaDoTempo(HttpServletRequest req, HttpServletResponse resp, int idTempo) throws Exception{
		try {
			resp.sendRedirect("index.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void listaLinhaDoTempo(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		try {
			resp.sendRedirect("index.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
