package br.com.hopp.disrupt21.to;

public class LocalAcontecimentoTo {
	
	private int id;
	private String nomeLocalAcontecimento;
	private String resumo;
	
	
	public LocalAcontecimentoTo() {
	}
	
	public LocalAcontecimentoTo(int id, String nome, String resumo) {
		this.id = id;
		this.nomeLocalAcontecimento = nome;
		this.resumo = resumo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nomeLocalAcontecimento;
	}
	public void setNome(String nome) {
		this.nomeLocalAcontecimento = nome;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	
}
