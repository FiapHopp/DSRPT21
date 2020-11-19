package br.com.hopp.disrupt21.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.hopp.disrupt21.bo.LinhaDoTempoBo;
import br.com.hopp.disrupt21.bo.PersonagemBo;
import br.com.hopp.disrupt21.to.LinhaDoTempoTo;
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
	public void personagem(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("ENTROU NO METODO PERSONAGEM");
				
		PersonagemBo personagemBo = new PersonagemBo();
	
	//	List<PersonagemTo> listaPersonagem = personagemBo.lista();
		String teste = "Lucas";
			
		request.setAttribute("teste", teste);
		request.getRequestDispatcher("/DISRUPT21/pages/personagens/personagens.jsp").forward(request, response);
		//response.sendRedirect("/DISRUPT21/pages/personagens/personagens.jsp");
			
				


		
	}

}
