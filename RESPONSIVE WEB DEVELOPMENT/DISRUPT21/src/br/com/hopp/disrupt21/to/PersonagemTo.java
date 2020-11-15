package br.com.hopp.disrupt21.to;

public class PersonagemTo {
	
	private int id;
	private String nomePersonagem;
	private int idadePersonagem;
	private AtorTo ator;
	private String resumo;
	private String sexo;
	
	public PersonagemTo(int id,String nomePersonagem, int idadePersonagem, AtorTo ator,String resumo,String sexo) {
		this.id= id;
		this.nomePersonagem = nomePersonagem;
		this.idadePersonagem = idadePersonagem;
		this.ator = ator;
		this.resumo= resumo;
		this.sexo = sexo;
	}
	
	public PersonagemTo() {
		// TODO Auto-generated constructor stub
	}

	public String getNomePersonagem() {
		return nomePersonagem;
	}

	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}

	public int getIdadePersonagem() {
		return idadePersonagem;
	}

	public void setIdadePersonagem(int idadePersonagem) {
		this.idadePersonagem = idadePersonagem;
	}

	public AtorTo getAtor() {
		return ator;
	}

	public void setAtor(AtorTo ator) {
		this.ator = ator;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
