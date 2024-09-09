package agag;

public class LavaLouca extends Eletrodomestico {
	
	private double litros;
	

	public LavaLouca() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}



	public LavaLouca(String fabricante, String modelo, double consumo, double litros) {
		super(fabricante, modelo, consumo);
		this.litros = litros;
	}
	

	
}
