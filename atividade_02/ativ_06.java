package aula_02;
import java.util.Scanner;

public class ativ_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do sal�rio m�nimo:");
		double salario_min = sc.nextDouble();
		
		System.out.println("Digite o valor do seu sal�rio:");
		double salario_max = sc.nextDouble();
		
		 int quantia = (int) (salario_max / salario_min);
		
		System.out.print("\nEssa � a quantidade de sal�rios m�nimos que voc� ganha:" +quantia);
		
		sc.close();
	}

}
