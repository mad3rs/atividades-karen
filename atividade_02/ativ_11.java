package aula_02;

import java.util.Scanner;

public class ativ_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hora, min, hora_convertida, min_total, seg_total;
		
		System.out.println("Digite um horário:");
		hora = sc.nextInt();
		
		System.out.println("Digite um minuto:");
		min = sc.nextInt();
		
		hora_convertida = (hora *60);
		min_total = ((hora*60)+hora_convertida);
		seg_total = (((hora*60)+min)*60);
		
		System.out.printf("\nA hora informada, convertida para minutos é:%d\nO total de minutos é:%d\nO total de segundos é:%d", hora_convertida, min_total, seg_total );
		
		sc.close();

	}

}
