package br.com.hopp.disrupt21.bo;

import java.util.Date;

import br.com.hopp.disrupt21.to.PerguntasTo;
import br.com.hopp.disrupt21.to.QuizViewTo;
import br.com.hopp.disrupt21.to.TentativaTo;

public class TentativaBo {

//	int a=1;
//	int b=0;
//	int c=0;
//	int d=0;
//	int e=0;
//	
//	int escolha=a;
//	
//	int respostaCerta= a;
//	
//	int total=0;
//	int valor=5;
//	
//		if (escolha == respostaCerta) {
//			System.out.println("Acertou");
//			total = total + valor;
//
//		} else {
//			System.out.println("Errou");
//		}
//	System.out.println("Sua pontua��o:" + total);

	public void assinalar() {
		
		QuizViewTo quizView = new QuizViewTo();
		PerguntasTo perguntasTo= new PerguntasTo();	
		TentativaTo tentativaTo = new TentativaTo();
		Date dataRegistro = new Date(); 
		
		dataRegistro.getTime();
		tentativaTo.setDataRegistro(dataRegistro);
		perguntasTo.setEscolha("${userAnswer}"); //userAnswers vir� do input da view (ela carregar� a alternativa escolhida)

		if (perguntasTo.getEscolha().equalsIgnoreCase(perguntasTo.getRespostaCerta())) {
			//FAZENDO O AUTO INCREMENTO (PEGANDO O VALOR DA PERGUNTA E SOMANDO COM A QUANTIDADE DE PONTOS QUE O USUARIO J� POSSUI)
			int pontuacao = tentativaTo.getPontos();
			pontuacao = pontuacao + perguntasTo.getValorDaPergunta();
			tentativaTo.setPontos(pontuacao);
		}
		
		//		tentativaBo.registrar(tentativaTo);				
		
	}
}
