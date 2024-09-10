package exeplos;

public class Loja {
	
	private String nome;
	private Cliente[] clientes;
	private Funcionario[] funcionarios;
	
	
	public Loja(String nome, Cliente[] clientes, Funcionario[] funcionarios) {
		super();
		this.nome = nome;
		this.clientes = clientes;
		this.funcionarios = funcionarios;
	}


	public Loja() {
		super();
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Cliente[] getClientes() {
		return clientes;
	}


	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}


	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}


	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}


	public void identificarContatoFuncionarioMaiorSalario() {
		Funcionario func = this.getFuncionarios()[0];
		for(int i =0; i< this.funcionarios.length; i++) {
			
			if(func.getSalario() < this.getFuncionarios()[i].getSalario()) {
				func = this.getFuncionarios()[i];
			}
			
		}
		System.out.println("contaco maior salario: ");
		System.out.println("Celular: " + func.getContato().getCelular());
		System.out.println("Email: " + func.getContato().getEmail());
		
		
	}
	

}
