package br.com.hopp.disrupt21.bo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hopp.disrupt21.dao.oracle.TentativaDaoOracle;
import br.com.hopp.disrupt21.to.QuizViewTo;
import br.com.hopp.disrupt21.to.TentativaTo;

public class TentativaBo {
	TentativaDaoOracle tentativaDaoOracle = new TentativaDaoOracle();
	
	public void cadastrar (TentativaTo tentativaTo) throws SQLException, Exception{
		tentativaDaoOracle.cadastrar(tentativaTo);
	}

	public boolean assinalar(int idQuiz,String respostaUsuario) throws Exception {		
		//RESGATAR QUIZ
		QuizViewBo quizViewBo = new QuizViewBo();
		List <QuizViewTo> lista = new ArrayList<QuizViewTo>();
		lista = quizViewBo.pesquisar(idQuiz);
		TentativaTo tentativaTo = new TentativaTo();
		tentativaTo.setIdQuiz(idQuiz);
		
		
		for (QuizViewTo item : lista) {
			if(respostaUsuario.equalsIgnoreCase(item.getRespostaCerta())) {
				tentativaTo.setPontos(item.getValorPergunta());
				System.out.println("Teste");
				cadastrar(tentativaTo);
				return true;
			}
		}
		tentativaTo.setPontos(0);
		cadastrar(tentativaTo);
		return false;
	}
}


//		lista.
//		lista.forEach((quizViewItem)->{
//			if(respostaUsuario.equalsIgnoreCase(quizViewItem.getRespostaCerta())) {
//				System.out.println("Teste");
//				//insert na tentativaTO
//				resultado = true;
//			}
//		});
//		
