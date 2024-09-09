package exeplos;

import java.util.ArrayList;

public class ProgramaContaBancaria {

	   public static void main(String[] args) {
           ContaCorrente cc1 = new ContaCorrente();
           cc1.setBanco("Banco do Brasil");
           cc1.setAgencia(1);
           cc1.setNumero(123);
           cc1.setTitular("Calebe");
           cc1.setSaldo(100);
           cc1.setLimite(100);

           double saldoAtual = cc1.depositar(500);
           System.out.println("Novo Saldo: " + saldoAtual);
           
           if(cc1.sacar(100)) {
               System.out.println("Novo Saldo - Saque: " + cc1.getSaldo());
           } else {
               System.out.println("O valor excede o limite da conta");
           }
           
           ContaPoupanca cp1 = new ContaPoupanca();
           
           cp1.setBanco("Caixa economica");
           cp1.setNumero(321);
           cp1.setTitular("Cabele");
           cp1.setAgencia(1);
           cp1.setSaldo(300);
           
           
           double valor = cp1.depositar(300);
           
           System.out.println("Saldo da poupança do cabele é " + valor);
           
           if(cp1.sacar(300)) {
        	   System.out.println("novo saldo - saque é " + cp1.getSaldo());
           }else {
        	   System.out.println("O valor excede o limite da conta");
        	   
           }
           ContaCorrente c1 = new ContaCorrente("bb", 3 ,1 , "gay", 100, 100);
           ContaCorrente c2 = new ContaCorrente("bb", 4 ,2 , "yag", 200, 5000);
           ContaCorrente c3 = new ContaCorrente("bb", 9 ,7 , "gpo", 330, 330);
           ContaCorrente c4 = new ContaCorrente("bb", 12 ,7 , "rs", 330, 330);
           
           ArrayList<ContaCorrente> lista = new ArrayList<>();
           lista.add(c1);
           lista.add(c2);
           lista.add(c3);
           lista.add(c4);
           
           for(ContaCorrente c : lista) {
        	   System.out.println(c);
        	   System.out.println("\n--------------------\n");
           }
       }

}
