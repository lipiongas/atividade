package agag;

public class Eletrodomestico {
	
	private String fabricante;
	private String modelo;
	private double consumo;
	
	
	


	

	public Eletrodomestico() {
		super();
	}

	public Eletrodomestico(String fabricante, String modelo, double consumo) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.consumo = consumo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	
	public double calcularconsumo (int dias) {
	
	return this.getConsumo() * dias;
	}
	
	public double calcularconsumo () {
		
		return this.getConsumo() * 30;
		}
		

	

}
