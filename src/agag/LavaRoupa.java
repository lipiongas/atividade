package agag;

public class LavaRoupa extends Eletrodomestico {
	
	private double kilos;
	

	public LavaRoupa() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public LavaRoupa(String fabricante, String modelo, double consumo, double kilos) {
		super(fabricante, modelo, consumo);
		this.kilos = kilos;
	}



	public double getKilos() {
		return kilos;
	}

	public void setKilos(double kilos) {
		this.kilos = kilos;
	}

	
}
