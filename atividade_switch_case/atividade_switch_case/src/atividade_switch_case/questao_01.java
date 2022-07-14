package atividade_switch_case;

import java.util.Scanner;

public class questao_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int cod, sal;
		double novoSal = 0, aumento = 0;
		 String cargo = "";
	    
        System.out.print("1 - Escrituário"
                +"\n2 - Secretário"
                +"\n3 - Caixa"
                +"\n4 - Gerente"
                +"\n5 - Diretor"
                + "\nDigite o código correspondente ao seu cargo:");
        cod = sc.nextInt();
    
        System.out.print("Agora digite o valor do seu salário: ");
        sal = sc.nextInt();
		
		switch (cod) {
		case 1:
		cargo = "Escrituário";
        aumento = sal * 0.5;
        novoSal = sal + aumento;
        break;
		
		case 2:
		cargo = "Secretário";
        aumento = sal * 0.35;
        novoSal = sal + aumento;
        break;
		
		case 3:
		cargo = "Caixa";
        aumento = sal * 0.2;
        novoSal = sal + aumento;
        break;

		case 4:
		cargo = "Gerente";
        aumento = sal * 0.1;
        novoSal = sal + aumento;
        break;
		
		case 5:
		cargo = "Diretor";
        aumento = sal * 0;
        novoSal = sal + aumento;
        break;
	}
		
        System.out.print("\nCargo: " + cargo + "\nAumento: " + aumento + "\nNovo sal�rio: " + novoSal);

        sc.close();
	}

}
