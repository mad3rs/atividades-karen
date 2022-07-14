package aula_03;

import java.util.Scanner;

public class ativ_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua nota no trabalho: ");
		double trab = sc.nextDouble();
		
		System.out.print("\nDigite sua nota na Av. Trimestral: ");
		double av = sc.nextDouble();
		
		System.out.print("\nDigite sua nota no exame final: ");
		double exam = sc.nextDouble();
		
		double mp = ((trab * 2) + (av * 3) + (exam * 5)) /  (2+3+5);
		
		if (mp > 8) {
			System.out.println("\nSeu conceito final é: A");
		}
		
		if (mp  > 7 && mp <= 7.9) {
			System.out.println("\nSeu conceito final é: B");
		}
		
		if (mp > 6 && mp <= 6.9) {
			System.out.println("\nSeu conceito final é: C");
		}
		
		if (mp > 5 && mp <= 5.9) {
			System.out.println("\nSeu conceito final é: D");
		}
		
		if (mp > 0 && mp <= 4.9) {
			System.out.println("\nSeu conceito final é: E");
		}
	}
 
}
