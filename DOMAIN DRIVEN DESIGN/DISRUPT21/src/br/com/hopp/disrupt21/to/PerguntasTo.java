package br.com.hopp.disrupt21.to;

public class PerguntasTo {
	
	private int id;
	private String pergunta;
	private String respostaCerta;
	private String valorDaPergunta;
	
	
	
	public PerguntasTo() {
	}

	public PerguntasTo(int id, String pergunta, String respostaCerta, String valorDaPergunta) {
		this.id = id;
		this.pergunta = pergunta;
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
	public String getValorDaPergunta() {
		return valorDaPergunta;
	}
	public void setValorDaPergunta(String valorDaPergunta) {
		this.valorDaPergunta = valorDaPergunta;
	}
	
	
}
