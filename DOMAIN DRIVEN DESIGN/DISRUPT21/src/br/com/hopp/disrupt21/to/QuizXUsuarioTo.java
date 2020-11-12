package br.com.hopp.disrupt21.to;

public class QuizXUsuarioTo {
	private int id;
	private int idUsuario;
	private int idQuiz;
	private int pontos;
	private String dataRegistro;
	
	
	
	
	
	public QuizXUsuarioTo() {
	}

	public QuizXUsuarioTo(int id, int idUsuario, int idQuiz, int pontos, String dataRegistro) {
		this.id = id;
		this.idUsuario = idUsuario;
		this.idQuiz = idQuiz;
		this.pontos = pontos;
		this.dataRegistro = dataRegistro;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdQuiz() {
		return idQuiz;
	}
	public void setIdQuiz(int idQuiz) {
		this.idQuiz = idQuiz;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public String getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	
	
}
