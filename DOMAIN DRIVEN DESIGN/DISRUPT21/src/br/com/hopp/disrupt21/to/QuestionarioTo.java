package br.com.hopp.disrupt21.to;

public class QuestionarioTo {
	
	private int idPergunta;
	private int idQuiz;
	
	
	
	public QuestionarioTo() {
	}

	public QuestionarioTo(int idPergunta, int idQuiz) {
		this.idPergunta = idPergunta;
		this.idQuiz = idQuiz;
	}
	
	public int getIdPergunta() {
		return idPergunta;
	}
	public void setIdPergunta(int idPergunta) {
		this.idPergunta = idPergunta;
	}
	public int getIdQuiz() {
		return idQuiz;
	}
	public void setIdQuiz(int idQuiz) {
		this.idQuiz = idQuiz;
	}
	
	
}
