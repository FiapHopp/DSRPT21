package br.com.hopp.disrupt21.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import br.com.hopp.disrupt21.bo.PersonagemBo;
import br.com.hopp.disrupt21.to.PersonagemTo;

@WebServlet(urlPatterns = { "/personagens" })
public class PersonagemController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public PersonagemController() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// VERIFICA A URL PARA REDIRECIONAR
		switch (request.getRequestURI()) {

			case "/DISRUPT21/personagens":
				try {
					personagem(request, response);
				} catch (Exception e) {

					e.printStackTrace();
				}
				break;
	
			default:
				response.sendRedirect("/DISRUPT21/pages/erro/erro.jsp?msgStatus=Pagina não encontrada");

		}

	}

	// MONTA TODOS AS INFORMACOES QUE A PERSONAGEM.JSP PRECISA E DEPOIS REDIRECIONA
	private void personagem(HttpServletRequest request, HttpServletResponse response) throws Exception {

		PersonagemBo personagemBo = new PersonagemBo();

		List<PersonagemTo> listaPersonagem = personagemBo.lista();
		request.setAttribute("lista_personagens", listaPersonagem);

		request.getRequestDispatcher("/pages/personagens/personagens.jsp").forward(request, response);

		System.out.println("passou");
	}

}
