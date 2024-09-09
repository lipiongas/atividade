package agag;

public class cozinha {

	public static void main(String[] args) {
	
		Geladeira g1 = new Geladeira("ipe", "s20-plus", 110, 12);
		Fogao f1 = new Fogao("dragonhouse", "vruuuuu", 90, 5);
		LavaLouca ll1 = new LavaLouca("FENIC", "triste", 70, 10);
		Microondas m1 = new Microondas("feliz", "ninico", 200, 15 );
		
		System.out.println("\n O consumo em 10 dias é: " + ( g1.calcularconsumo(10) + f1.calcularconsumo(10) + ll1.calcularconsumo(10) + m1.calcularconsumo(10)));
		System.out.println("\n O consumo em 30 dias é: " + ( g1.calcularconsumo() + f1.calcularconsumo() + ll1.calcularconsumo() + m1.calcularconsumo()));
	
	}

	
}
