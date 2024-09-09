package agag;

public class Geladeira extends Eletrodomestico{
	
	private double litros;
	



	public Geladeira() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Geladeira(String fabricante, String modelo, double consumo, double litros) {
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
