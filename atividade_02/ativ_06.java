package aula_02;
import java.util.Scanner;

public class ativ_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do salário mínimo:");
		double salario_min = sc.nextDouble();
		
		System.out.println("Digite o valor do seu salário:");
		double salario_max = sc.nextDouble();
		
		 int quantia = (int) (salario_max / salario_min);
		
		System.out.print("\nEssa é a quantidade de salários mínimos que você ganha:" +quantia);
		
		sc.close();
	}

}
