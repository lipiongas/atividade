package exeplos;

public class Contato {
	
	private String celular;
	private String email;
	
	
	public Contato(String celular, String email) {
		super();
		this.celular = celular;
		this.email = email;
	}


	public Contato() {
		super();
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

}
