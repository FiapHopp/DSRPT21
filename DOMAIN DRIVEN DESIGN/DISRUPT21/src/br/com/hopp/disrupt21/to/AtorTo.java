package br.com.hopp.disrupt21.to;

public class AtorTo {
	
	private String nomeAtor;
	private String localidade;
	private int idadeLocalidade;
	
	
	
	public AtorTo() {
		super();
	}
	
	public AtorTo(String nomeAtor, String localidade, int idadeLocalidade) {
		super();
		this.nomeAtor = nomeAtor;
		this.localidade = localidade;
		this.idadeLocalidade = idadeLocalidade;
	}
	
	public String getNomeAtor() {
		return nomeAtor;
	}
	public void setNomeAtor(String nomeAtor) {
		this.nomeAtor = nomeAtor;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public int getIdadeLocalidade() {
		return idadeLocalidade;
	}
	public void setIdadeLocalidade(int idadeLocalidade) {
		this.idadeLocalidade = idadeLocalidade;
	}
}
