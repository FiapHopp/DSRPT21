package br.com.hopp.disrupt21.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns= {"/listaAll","/listar"})
public class PersonagemController extends HttpServlet {
	
	private static final long serialVersionUID= 1L;
	
	public PersonagemController() {
		super();
	}
	
	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		switch(request.getRequestURI()) {
		case "/listaAll":
			listaPersonagem(request,response);
			break;
		case "/listar":
			pesquisarPersonagem(request,response,Integer.parseInt(request.getParameter("")));
			break;
		default:
			response.sendRedirect("");
		}
		
	}

	private void pesquisarPersonagem(HttpServletRequest req, HttpServletResponse resp, int idPersonagem) {
		// TODO Auto-generated method stub
		
	}

	private void listaPersonagem(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}
	
}
