package exeplos;

public class ProgramaLoja {

	public static void main(String[] args) {

		Contato con1 = new Contato("77777777777", "meu_pau_comasa");
		Contato con2 = new Contato("99,99,99,99", "bolsonaro");
		Contato con3 = new Contato("88888888888", "lula");
		Contato con4 = new Contato("900000000000", "romario");
		Contato con5 = new Contato("aaaaaaaaaaaaa", "vou me mata");
		Contato con6 = new Contato("gggggggggggggg", "socorro");
		
		Cliente c1= new Cliente("antonio", con1, 1);
		Cliente c2= new Cliente("ana", con2, 2);
		Cliente c3= new Cliente("marco", con3, 3);
		Cliente c4= new Cliente("peter", con4, 4);
		Cliente [] clientes = {c1,c2,c3,c4};
		
		Funcionario f1 = new Funcionario("bruna", con5, 2000);
		Funcionario f2 = new Funcionario("prapo", con6, 3000);
		Funcionario[] funcionarios = {f1,f2};
		
		
		Loja l1 = new Loja("sonho",clientes, funcionarios );
		
		l1.identificarContatoFuncionarioMaiorSalario();
		
		l1.identificarNomeClienteMaisAntigo();
		
	}

}
