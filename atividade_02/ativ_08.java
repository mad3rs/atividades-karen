package aula_02;

import java.util.Scanner;

public class ativ_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do seu salário:");
		double salario = sc.nextDouble();
		
		System.out.print("Digite o valor da primeira conta atrasada");
		double conta1 = sc.nextDouble();
		
		System.out.print("\nDigite o valor da segunda conta atrasada:");
		double conta2 = sc.nextDouble();
		
		double resto = salario - ((conta1 * 1.02) + (conta2 * 1.02));
		System.out.println("\nDo seu salário sobram apenas:" +resto);
		
		sc.close();
	}

}
