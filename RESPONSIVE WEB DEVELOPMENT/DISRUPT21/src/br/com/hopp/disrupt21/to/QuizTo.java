package br.com.hopp.disrupt21.to;

public class QuizTo {
	
	private int id;
	private String titulo;
	
	
	
	public QuizTo() {
	}

	public QuizTo(int id, String titulo) {
		this.id = id;
		this.titulo = titulo;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
}
