package aula_02;

import java.util.Scanner;

public class ativ_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a tábuada que você quer:");
		int num = sc.nextInt();
		
		for(int i = 1; i <=10; i++) {
			
			System.out.println(i + "x" + num+ "=" + (i * num));
		}

	}

}
