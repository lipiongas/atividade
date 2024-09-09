package exeplos;

public class Funcionario extends Pessoa{
	
	private double salario;

	public Funcionario(double salario) {
		super();
		this.salario = salario;
	}

	public Funcionario() {
		super();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
