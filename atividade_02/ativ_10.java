package aula_02;

import java.util.Scanner;

public class ativ_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valor_real, valor_dolar, valor_euro, valor_libra;
		System.out.print("Digite o valor que você deseja levar para a sua viagem (em reais):");
		valor_real = sc.nextDouble();
		
		valor_euro = valor_real /5.25;
		valor_dolar = valor_real /4.99;
		valor_libra = valor_real /6.27;
		
		System.out.printf("Esse valor em: \nEuro =%.2f \nDolar =%.2f \nLibra =%.2f", valor_euro, valor_dolar, valor_libra);
		sc.close();
	}

}
