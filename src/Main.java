import java.util.Locale;
import java.util.Scanner;

import Entities.ContaBancaria;


public class Main {

	public static void main(String[] args) {
		ContaBancaria c1;
		int escolha = -1;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter com o númer da conta:");
		System.out.print("Número: ");
		int numeroconta = sc.nextInt();
		System.out.println("Enter com o nome do titular da conta:");
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Haverá depósito inicial: (1- Sim / 2 - Não");
		int esco = sc.nextInt();
		if(esco == 1){
			System.out.println("Digite o valor:");
			System.out.print("Valor: ");
			double valor = sc.nextDouble();
	        c1 = new ContaBancaria(numeroconta,nome,valor);
		}else{
		    c1 = new ContaBancaria(numeroconta,nome);
		}
		
		System.out.println(c1.totring());
		
		do{
			System.out.println("1- Depositar 2- Sacar 0 - Sair");
			System.out.println("Escolha: ");
			escolha = sc.nextInt();
			switch(escolha){
			case 0:
				System.out.println("Saindo!!!");
				
			break;
			case 1:
				System.out.println("Digita o valor para depósito:");
				System.out.println("Valor: ");
				double valorde = sc.nextDouble();
				c1.depositar(valorde);
				System.out.println(c1.totring());
			break;
			
			case 2:
				System.out.println("Digita o valor para sacar:");
				System.out.println("Valor: ");
				double valorsa = sc.nextDouble();
				c1.sacar(valorsa);
				System.out.println(c1.totring());
			
			break;
			
			default:
				System.out.println("Opção Inválida!!!");
			break;
		  }
			
		}while(escolha != 0);
		
		
		
		
		sc.close();

	}

}
