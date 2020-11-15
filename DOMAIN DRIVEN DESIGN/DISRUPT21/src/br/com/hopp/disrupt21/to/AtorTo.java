package br.com.hopp.disrupt21.to;

public class AtorTo {
	
	private int id;
	private String nomeAtor;
	private String localidade;
	private String dataNascimento;
	private String sexo;
	
	
	public AtorTo() {
		super();
	}
	
	public AtorTo(int id,String nomeAtor, String localidade, String dataNascimento, String sexo) {
		this.id=id;
		this.nomeAtor = nomeAtor;
		this.localidade = localidade;
		this.dataNascimento = dataNascimento;
		this.sexo= sexo;
	}
	
	public AtorTo(int id) {
		// TODO Auto-generated constructor stub
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
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
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
