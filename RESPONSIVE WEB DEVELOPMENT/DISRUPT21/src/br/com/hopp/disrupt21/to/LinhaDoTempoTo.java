package br.com.hopp.disrupt21.to;

import java.util.Date;

public class LinhaDoTempoTo {
	
	private int id;
	private String titulo;
	private String acontecimento;
	private String resumo;
	private Date anoAcontecimento;
	private int idTempoAcontecimento;
	private int idLocalAcontecimento;
	
	
	public LinhaDoTempoTo() {
		
	}

	public LinhaDoTempoTo(int id,String titulo, String acontecimento, Date anoAcontecimento,
			int idTempoAcontecimento, int idLocalAcontecimento) {
		this.id = id;
		this.titulo = titulo;
		this.acontecimento = acontecimento;
		this.anoAcontecimento = anoAcontecimento;
		this.idTempoAcontecimento = idTempoAcontecimento;
		this.idLocalAcontecimento = idLocalAcontecimento;
	}
	
	
	
	public LinhaDoTempoTo(String titulo, String acontecimento, String resumo, Date anoAcontecimento) {
		this.titulo = titulo;
		this.acontecimento = acontecimento;
		this.resumo = resumo;
		this.anoAcontecimento= anoAcontecimento;
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
	public Date getAnoAcontecimento() {
		return anoAcontecimento;
	}
	public void setAnoAcontecimento(Date anoAcontecimento) {
		this.anoAcontecimento = anoAcontecimento;
	}
	

	public int getIdTempoAcontecimento() {
		return idTempoAcontecimento;
	}

	public void setIdTempoAcontecimento(int idTempoAcontecimento) {
		this.idTempoAcontecimento = idTempoAcontecimento;
	}

	public int getIdLocalAcontecimento() {
		return idLocalAcontecimento;
	}

	public void setIdLocalAcontecimento(int idLocalAcontecimento) {
		this.idLocalAcontecimento = idLocalAcontecimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	
	
}
