package aula_03;

import java.util.Scanner;

public class ativ_3 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Digite outro n�mero: ");
		double num2 = sc.nextDouble();
		
		if (num1 > num2) {
			System.out.printf("\nO n�mero %.0f � o maior", num1);
		}
		
		if (num2  > num1) {
			System.out.printf("\nO n�mero %.0f � o maior", num2);
		}

	}

}
