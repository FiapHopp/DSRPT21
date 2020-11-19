package br.com.hopp.disrupt21.to;

public class QuizViewTo {
	private String nomeTitulo;
	private String pergunta;
	private int valorPergunta;
	private String respostaCerta;
	private String resposta1;
	private String resposta2;
	private String resposta3;
	private String resposta4;
	private String resposta5;
	
	
	
	public QuizViewTo() {
	}

	public QuizViewTo(String nomeTitulo, String pergunta, int valorPergunta, String respostaCerta, String resposta1,
			String resposta2, String resposta3, String resposta4, String resposta5) {
		this.nomeTitulo = nomeTitulo;
		this.pergunta = pergunta;
		this.valorPergunta = valorPergunta;
		this.respostaCerta = respostaCerta;
		this.resposta1 = resposta1;
		this.resposta2 = resposta2;
		this.resposta3 = resposta3;
		this.resposta4 = resposta4;
		this.resposta5 = resposta5;
	}
	
	public String getNomeTitulo() {
		return nomeTitulo;
	}
	public void setNomeTitulo(String nomeTitulo) {
		this.nomeTitulo = nomeTitulo;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public int getValorPergunta() {
		return valorPergunta;
	}
	public void setValorPergunta(int valorPergunta) {
		this.valorPergunta = valorPergunta;
	}
	public String getRespostaCerta() {
		return respostaCerta;
	}
	public void setRespostaCerta(String respostaCerta) {
		this.respostaCerta = respostaCerta;
	}
	public String getResposta1() {
		return resposta1;
	}
	public void setResposta1(String resposta1) {
		this.resposta1 = resposta1;
	}
	public String getResposta2() {
		return resposta2;
	}
	public void setResposta2(String resposta2) {
		this.resposta2 = resposta2;
	}
	public String getResposta3() {
		return resposta3;
	}
	public void setResposta3(String resposta3) {
		this.resposta3 = resposta3;
	}
	public String getResposta4() {
		return resposta4;
	}
	public void setResposta4(String resposta4) {
		this.resposta4 = resposta4;
	}
	public String getResposta5() {
		return resposta5;
	}
	public void setResposta5(String resposta5) {
		this.resposta5 = resposta5;
	}
	
	
}
