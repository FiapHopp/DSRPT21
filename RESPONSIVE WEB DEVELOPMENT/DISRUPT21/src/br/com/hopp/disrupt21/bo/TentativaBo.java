package br.com.hopp.disrupt21.bo;

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
//	System.out.println("Sua pontuação:" + total);

	public void assinalar() {
		QuizViewTo quizView = new QuizViewTo();
		PerguntasTo perguntasTo= new PerguntasTo();	
		TentativaTo TentativaTo = new TentativaTo();
		perguntasTo.setEscolha("${userAnswer}");
		if (perguntasTo.getEscolha().equalsIgnoreCase(perguntasTo.getRespostaCerta())) {
			
		}
		
		
		
	}
}
