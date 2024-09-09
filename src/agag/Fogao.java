package agag;

public class Fogao extends Eletrodomestico {
	
	private int quantidadebocas;

	
	
	public Fogao() {
		super();
		// TODO Auto-generated constructor stub
	}



	
	
	public Fogao(String fabricante, String modelo, double consumo, int quantidadebocas) {
		super(fabricante, modelo, consumo);
		this.quantidadebocas = quantidadebocas;
	}






	public int getQuantidadebocas() {
		return quantidadebocas;
	}

	public void setQuantidadebocas(int quantidadebocas) {
		this.quantidadebocas = quantidadebocas;
	}

	
}
