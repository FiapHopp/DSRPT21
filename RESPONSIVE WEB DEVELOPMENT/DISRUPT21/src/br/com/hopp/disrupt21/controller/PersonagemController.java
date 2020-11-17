package br.com.hopp.disrupt21.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/personagens" })
public class PersonagemController extends HttpServlet {
	
	

	private static final long serialVersionUID = 1L;

	public PersonagemController() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		switch (request.getRequestURI()) {

			case "/DISRUPT21/personagens":	
				personagem(request, response);
				break;
			case "/listar":
				
				break;
			default:
				System.out.println("ENTROU default");
		}

	}
	
	public void personagem (HttpServletRequest request, HttpServletResponse response) {
		try {
			response.sendRedirect("/DISRUPT21/pages/personagens/personagens.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
