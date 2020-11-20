package br.com.hopp.disrupt21.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.hopp.disrupt21.bo.QuizViewBo;
import br.com.hopp.disrupt21.to.QuizViewTo;


@WebServlet(urlPatterns= {"/quiz"})
public class QuizController extends HttpServlet {
	
	private static final long serialVersionUID= 1L;
	
	public QuizController() {
		super();
	}
	
	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		switch (request.getRequestURI()) {
			case "/DISRUPT21/quiz":
				
				try {
						quiz(request, response);
					} catch (Exception e) {
			
						e.printStackTrace();
					}				
					break;
				
			default:
				
		}
		
	}

	public void quiz(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		QuizViewBo quizViewBo = new QuizViewBo();

		QuizViewTo quiz = quizViewBo.pesquisar(1);
		System.out.println("RESULTADO: " + quiz);
		
		
//		if(quiz.isEmpty()) {
//			response.sendRedirect("/DISRUPT21/pages/erro/erro.jsp?msgStatus=Nenhuma pergunta encontrada.");
//			
//		}else {
//			request.setAttribute("lista_quiz", quiz);			
//			request.getRequestDispatcher("/pages/quiz/quiz.jsp").forward(request, response);
//			
//		}
//		
		
				
	}

}