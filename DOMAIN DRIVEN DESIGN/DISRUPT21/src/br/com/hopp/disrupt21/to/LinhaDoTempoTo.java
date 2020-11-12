package br.com.hopp.disrupt21.to;

public class LinhaDoTempoTo {
	
	private int id;
	private String titulo;
	private String acontecimento;
	private int anoAcontecimento;
	private TempoAcontecimentoTo tempoAcontecimento;
	private LocalAcontecimentoTo localAcontecimento;
	
	
	public LinhaDoTempoTo() {
		
	}

	public LinhaDoTempoTo(int id,String titulo, String acontecimento, int anoAcontecimento,
			TempoAcontecimentoTo tempoAcontecimento, LocalAcontecimentoTo localAcontecimento) {
		this.setId(id);
		this.titulo = titulo;
		this.acontecimento = acontecimento;
		this.anoAcontecimento = anoAcontecimento;
		this.tempoAcontecimento = tempoAcontecimento;
		this.localAcontecimento = localAcontecimento;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAcontecimento() {
		return acontecimento;
	}
	public void setAcontecimento(String acontecimento) {
		this.acontecimento = acontecimento;
	}
	public int getAnoAcontecimento() {
		return anoAcontecimento;
	}
	public void setAnoAcontecimento(int anoAcontecimento) {
		this.anoAcontecimento = anoAcontecimento;
	}
	public TempoAcontecimentoTo getTempoAcontecimento() {
		return tempoAcontecimento;
	}
	public void setTempoAcontecimento(TempoAcontecimentoTo tempoAcontecimento) {
		this.tempoAcontecimento = tempoAcontecimento;
	}
	public LocalAcontecimentoTo getLocalAcontecimento() {
		return localAcontecimento;
	}
	public void setLocalAcontecimento(LocalAcontecimentoTo localAcontecimento) {
		this.localAcontecimento = localAcontecimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
