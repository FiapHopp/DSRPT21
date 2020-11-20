package br.com.hopp.disrupt21.to;

public class PerguntasTo {
	
	private int id;
	private String escolha;
	private String pergunta;
	private String resposta1;
	private String resposta2;
	private String resposta3;
	private String resposta4;
	private String resposta5;
	private String respostaCerta;
	private int valorDaPergunta;
	
	
	
	public PerguntasTo() {
	}

	public PerguntasTo(int id, String pergunta, String resposta1, String resposta2, String resposta3, String resposta4,
			String resposta5, String respostaCerta, int valorDaPergunta) {
		
		this.id = id;
		this.pergunta = pergunta;
		this.resposta1 = resposta1;
		this.resposta2 = resposta2;
		this.resposta3 = resposta3;
		this.resposta4 = resposta4;
		this.resposta5 = resposta5;
		this.respostaCerta = respostaCerta;
		this.valorDaPergunta = valorDaPergunta;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public String getRespostaCerta() {
		return respostaCerta;
	}
	public void setRespostaCerta(String respostaCerta) {
		this.respostaCerta = respostaCerta;
	}
	public int getValorDaPergunta() {
		return valorDaPergunta;
	}
	public void setValorDaPergunta(int valorDaPergunta) {
		this.valorDaPergunta = valorDaPergunta;
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

	public String getEscolha() {
		return escolha;
	}

	public void setEscolha(String escolha) {
		this.escolha = escolha;
	}
	
	
}
