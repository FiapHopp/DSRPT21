package br.com.hopp.disrupt21.to;

import java.util.Date;

public class PersonagemTo {
	
	private int id;
	private String nomePersonagem;
	private int idadePersonagem;
	private AtorTo ator;
	private String resumo;
	private String sexo;
	private String imgPass;
	private String imgPres;
	
	
	public String getImgPass() {
		return imgPass;
	}

	public void setImgPass(String imgPass) {
		this.imgPass = imgPass;
	}

	public String getImgPres() {
		return imgPres;
	}

	public void setImgPres(String imgPres) {
		this.imgPres = imgPres;
	}

	public PersonagemTo(int id,String nomePersonagem, int idadePersonagem,String resumo,String sexo, String imgPass, String imgPres) {
		this.id= id;
		this.nomePersonagem = nomePersonagem;
		this.idadePersonagem = idadePersonagem;
		this.sexo = sexo;
		this.resumo= resumo;
		this.imgPass = imgPass;
		this.imgPres = imgPres;
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
