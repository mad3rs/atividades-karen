package aula_02;
import java.util.Scanner;

public class ativ_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor fixo do seu sal�rio:");
		double salario = sc.nextDouble();
		System.out.println("Digite o n�mero de vendas realizadas no m�s:");
		int num = sc.nextInt();
		
		double comissao = 0;
		
		for(int i = 0; i < num; i++) {
			System.out.println("Qual o valor da" +(i+1)+"venda?\nR$");
			
			double valorvenda =sc.nextDouble();
			
			comissao += (valorvenda * 0.04);
		}
		System.out.printf("O seu sal�rio desse m�s �: R$.2f", (salario + comissao));
		sc.close();
	}

}
