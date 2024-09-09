package agag;

public class Microondas extends Eletrodomestico {
	
	private double litros;
	
	
	public Microondas() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
	
	public Microondas(String fabricante, String modelo, double consumo, double litros) {
		super(fabricante, modelo, consumo);
		this.litros = litros;
	}





	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}
	

	
}
