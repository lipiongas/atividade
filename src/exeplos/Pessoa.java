package exeplos;

public class Pessoa {
	
	private String nome;
	private Contato contato;
	
	
	public Pessoa() {
		super();
	}


	public Pessoa(String nome, Contato contato) {
		super();
		this.nome = nome;
		this.contato = contato;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Contato getContato() {
		return contato;
	}


	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	
	

}
