package atividade_04;

import java.util.Scanner;

public class questao_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double aumento = 0, novoSalario = 0;
        String cargo = "";

        System.out.print("Informe o c�digo correspondente ao cargo: ");
        int cod = sc.nextInt();
        System.out.print("Informe o seu sal�rio atual: ");
        double sal = sc.nextDouble();


        if(cod == 1){
            cargo = "Escritur�rio";
            novoSalario = sal * 1.5;
            aumento = novoSalario - sal;
        } else if(cod == 2){
            cargo = "Secret�rio";
            novoSalario = sal * 1.35;
            aumento = novoSalario - sal;
        } else if(cod == 3){
            cargo = "Caixa";
            novoSalario = sal * 1.2;
            aumento = novoSalario - sal;
        } else if(cod == 4){
            cargo = "Gerente";
            novoSalario = sal * 1.1;
            aumento = novoSalario - sal;
        } else if(cod == 5){
            cargo = "Diretor";
            System.out.print("\nDiretores n�o possuem aumento");
        }

        System.out.print("\nCargo: " + cargo + "\nAumento: " + aumento + "\nNovo sal�rio: " + novoSalario);

        sc.close();
    }
}