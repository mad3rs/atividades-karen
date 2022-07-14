package aula_03;

import java.util.Scanner;

public class ativ_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua nota 1: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("\nDigite sua nota 2: ");
		double nota2 = sc.nextDouble();
		
		System.out.print("\nDigite sua 3: ");
		double nota3 = sc.nextDouble();
		
		double ma = (nota1 + nota2 + nota3) / (3);
		
		if (ma < 3) {
			System.out.println("\nSeu status é: Reprovado");
		}
		
		if (ma  < 7) {
			System.out.println("\nSeu status é: Exame");
			double falta = (6 - ma);
			System.out.println("Faltam " + falta+ " pontos para você ser aprovado. Está quase lá!!");
		}
		
		if (ma < 10) {
			System.out.println("\nSeu status é: Aprovado");
		}
	}
 
}
