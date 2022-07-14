package aula_03;

import java.util.Scanner;

public class ativ_3 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Digite outro número: ");
		double num2 = sc.nextDouble();
		
		if (num1 > num2) {
			System.out.printf("\nO número %.0f é o maior", num1);
		}
		
		if (num2  > num1) {
			System.out.printf("\nO número %.0f é o maior", num2);
		}

	}

}
