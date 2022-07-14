package aula_02;
import java.util.Scanner;

public class ativ_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor fixo do seu salário:");
		double salario = sc.nextDouble();
		System.out.println("Digite o número de vendas realizadas no mês:");
		int num = sc.nextInt();
		
		double comissao = 0;
		
		for(int i = 0; i < num; i++) {
			System.out.println("Qual o valor da" +(i+1)+"venda?\nR$");
			
			double valorvenda =sc.nextDouble();
			
			comissao += (valorvenda * 0.04);
		}
		System.out.printf("O seu salário desse mês é: R$.2f", (salario + comissao));
		sc.close();
	}

}
