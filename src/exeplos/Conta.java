package exeplos;

public class Conta {

	

	


	private String banco;
	private int agencia;
	private int numero;
	private String titular;
	private double saldo;

	
	public Conta(String banco, int agencia, int numero, String titular, double saldo) {
		super();
		this.banco = banco;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public Conta() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		saldo = saldo;
	}


	public double depositar(double valor) {

		this.setSaldo(this.getSaldo()+valor);
		return this.getSaldo();




	}
	
	@Override
	public String toString() {
		return "conta" + "\nBanco " + this.getBanco()
		+ "\n agencia " + this.getAgencia() +
		"\n numera " + this.getNumero() +
		"\n titular " + this.getTitular() +
		"\n saldo " + this.getSaldo();
	}
	
}
