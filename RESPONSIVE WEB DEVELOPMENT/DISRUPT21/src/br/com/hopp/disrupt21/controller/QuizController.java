package br.com.hopp.disrupt21.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns= {"/quiz"})
public class QuizController extends HttpServlet {
	
	private static final long serialVersionUID= 1L;
	
	public QuizController() {
		super();
	}
	
	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		switch (request.getRequestURI()) {

			case "/DISRUPT21/quiz":	
				quiz(request, response);
				break;
			case "/listar":
				
				break;
			default:
				System.out.println("ENTROU default");
		}
		
	}

	public void quiz(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.sendRedirect("/DISRUPT21/pages/quiz/quiz.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
