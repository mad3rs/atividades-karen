package aula_02;

import java.util.Scanner;

public class ativ_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horas, hora_extra;
		double salario_min, salario, salario_extra;
		
		System.out.println("Digite o n�mero de horas que voc� trabalhou:");
		horas = sc.nextInt();
		
		System.out.print("Digite o valor do sal�rio m�nimo:");
		salario_min = sc.nextDouble();
		
		System.out.println("Digite n�mero de horas extras que voc� fez:");
		hora_extra = sc.nextInt();
		
		salario =(horas *(salario_min /8));
		
		salario_extra = (horas * (salario_min/8)) +(hora_extra* (salario_min/4));
		
		
		System.out.printf("\nSeu sal�rio ser� de: %.2f\nE o valor com horas ser� de: %.2f" ,salario ,salario_extra);
		
		sc.close();
	}

}
