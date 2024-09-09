package exeplos;

public class ContaCorrente extends Conta{

 
	
	private double limite;
    
	
	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContaCorrente(String banco, int agencia, int numero, String titular, double saldo, double limite) {
		super(banco, agencia, numero, titular, saldo);
		this.limite = limite;
	}

	
   
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
   //metodos
    
    public boolean sacar(double valor) {
        boolean resultado = false;
        if (this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            resultado = true;
        }
        if (this.getSaldo() + this.getLimite() >= valor) {
            this.setSaldo(this.getSaldo() + this.getLimite() - valor);
            resultado = true;
        }
        return resultado;
    }
   
    @Override
    public String toString() {
    	return "Conta corrente: "
    			+ "\n" + super.toString()
    			+"\nlimite:" + this.getLimite() ;
    }
}