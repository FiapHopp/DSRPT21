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
import br.com.hopp.disrupt21.bo.TentativaBo;
import br.com.hopp.disrupt21.to.QuizViewTo;
import br.com.hopp.disrupt21.to.TentativaTo;


@WebServlet(urlPatterns= {"/quiz", "/responder"})
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
		case "/DISRUPT21/responder":
			try {
				receberResposta(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		default:

		}

	}

	public void quiz(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		QuizViewBo quizViewBo = new QuizViewBo();
		
		List<QuizViewTo> quiz = quizViewBo.pesquisarRandom();
		int idQuiz = quiz.get(0).getIdQuiz();
		request.setAttribute("lista_quiz", quiz);	
		request.setAttribute("id_quiz", idQuiz);
		request.getRequestDispatcher("/pages/quiz/quiz.jsp").forward(request, response);
				
	}
	
	public void receberResposta(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		TentativaBo tentativaBo =  new TentativaBo();
		String idQuiz = request.getParameter("idQuiz");
		String resposta1 = request.getParameter("selector1");
		String resposta2 = request.getParameter("selector2");
		String resposta3 = request.getParameter("selector3");
		String resposta4 = request.getParameter("selector4");
		String resposta5 = request.getParameter("selector5");
		
		tentativaBo.assinalar(Integer.parseInt(idQuiz), resposta1, 4);
		tentativaBo.assinalar(Integer.parseInt(idQuiz), resposta2, 4);
		tentativaBo.assinalar(Integer.parseInt(idQuiz), resposta3, 4);
		tentativaBo.assinalar(Integer.parseInt(idQuiz), resposta4, 4);
		tentativaBo.assinalar(Integer.parseInt(idQuiz), resposta5, 4); 
	}
	


}