package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta conta;
		
		
		System.out.print("Entre com o numero da conta: ");
		Integer numeroConta = sc.nextInt();

		System.out.print("Entre com o titular da conta: ");
		sc.nextLine();
		String titularConta = sc.nextLine();

		System.out.print("Quer depositar um valor inicial (y/n) ? ");

		char valorInicial = sc.next().charAt(0);

		if (valorInicial == 'y') {
			System.out.print("Entre com valor do deposito inicial: ");
			double depInicial = sc.nextDouble();
			conta = new Conta(numeroConta, titularConta, depInicial);
			
		}

		else {

		
		    conta = new Conta(numeroConta, titularConta);
 
		}

		System.out.println();
		System.out.println("Informacoes da conta: ");
		System.out.println(conta.toString());
		System.out.println();

		System.out.print("Entre com valor de deposito: ");
		double deposito = sc.nextDouble();
		conta.Deposito(deposito);

		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta.toString());
		System.out.println();

		System.out.print("Entre com valor de saque : ");
		double saque = sc.nextDouble();
		conta.Saque(saque);

		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta.toString());
		
		
		sc.close();

	}

}
