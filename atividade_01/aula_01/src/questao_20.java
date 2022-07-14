package aula_01;

import java.util.Scanner;

public class questao_20 {

	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Insira seu tempo de vida: ");
	        System.out.print("Dia: ");
	        int D = sc.nextInt();
	        System.out.print("Mês: ");
	        int M = sc.nextInt();
	        System.out.print("Ano: ");
	        int A = sc.nextInt();
	        
	        System.out.println("Total de dias que você está na Terra: " + ((A * 365) + (M * 30) + D));
	    }
	}
