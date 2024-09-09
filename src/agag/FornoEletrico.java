package agag;

public class FornoEletrico extends Eletrodomestico {

	
	private double litros;
	
	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public FornoEletrico() {
		super();
	}

	public FornoEletrico(String fabricante, String modelo, double consumo) {
		super(fabricante, modelo, consumo);
	}
	
	public double calcularperda (int dias) {
		
		return (this.getConsumo() * dias) * 1.25;
	}
	
	
public double calcularperda () {
		
		return (this.getConsumo() * 30) * 1.25;
	}
	
}
