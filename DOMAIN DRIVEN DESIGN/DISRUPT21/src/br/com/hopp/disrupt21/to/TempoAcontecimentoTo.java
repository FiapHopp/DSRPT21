package br.com.hopp.disrupt21.to;

public class TempoAcontecimentoTo {
	
	private int id;
	private String tempo;
	
	
	public TempoAcontecimentoTo(){
		
	}
	
	public TempoAcontecimentoTo(int id, String tempo) {
		this.id = id;
		this.tempo = tempo;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTempo() {
		return tempo;
	}
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	
	
}
