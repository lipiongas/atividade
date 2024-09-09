package exeplos;

public class Cliente extends Pessoa {
	
	private int codigo;

	public Cliente(int codigo) {
		super();
		this.codigo = codigo;
	}

	public Cliente() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	

}
