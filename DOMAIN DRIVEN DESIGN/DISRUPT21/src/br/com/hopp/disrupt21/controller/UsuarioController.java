package br.com.hopp.disrupt21.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/listaAll","/listar","/cadastrar"})
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID= 1L;
	
	public UsuarioController() {
		super();
	}
	
	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		switch(request.getRequestURI()) {
		case "/listaAll":
			listaUsuario(request,response);
			break;
		case "/listar":
			pesquisarUsuario(request,response,Integer.parseInt(request.getParameter("")));
			break;
		case "/cadastrar":
			cadastrarUsuario(request,response);
			break;
		default:
			response.sendRedirect("");
		}
		
	}

	private void cadastrarUsuario(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void pesquisarUsuario(HttpServletRequest req, HttpServletResponse resp, int parseInt) {
		// TODO Auto-generated method stub
		
	}

	private void listaUsuario(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}
}
