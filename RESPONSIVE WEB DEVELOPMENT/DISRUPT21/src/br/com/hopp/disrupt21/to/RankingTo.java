package br.com.hopp.disrupt21.to;

public class RankingTo {
	
	private int idRanking;
	private String nomeUsuario;
	private int pontuacao;
	
	
	
	
	public RankingTo() {
		
	}
	
	

	public RankingTo(String nomeUsuario, int pontuacao) {
		
		this.nomeUsuario = nomeUsuario;
		this.pontuacao = pontuacao;
	}



	public RankingTo(int idRankign, String nomeUsuario, int pontuacao) {
		
		this.idRanking = idRankign;
		this.nomeUsuario = nomeUsuario;
		this.pontuacao = pontuacao;
	}
	
	public int getIdRankign() {
		return idRanking;
	}
	public void setIdRankign(int idRankign) {
		this.idRanking = idRankign;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public int getPontuação() {
		return pontuacao;
	}
	public void setPontuação(int pontuação) {
		this.pontuacao = pontuação;
	}
	
	
}
