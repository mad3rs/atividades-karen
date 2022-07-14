package atividade_04;

import java.util.Scanner;

public class questao_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double sal;
        int op;

        System.out.println("• MENU •" + "\n1 - Imposto" + "\n2 - Novo salário" + "\n3 - Classificação" + "\nR: ");
        op = sc.nextInt();

        if (op == 1) {
            System.out.print("\nInsira seu salário atual: ");
            sal = sc.nextDouble();

            if (sal < 500) {
                System.out.print("\nImposto a pagar: " + (sal * 0.05));
            } else if (sal <= 850) {
                System.out.print("\nImposto a pagar: " + (sal * 0.10));
            } else {
                System.out.print("\nImposto a pagar: " + (sal * 0.15));
            }
            
        } else if (op == 2) {
            System.out.print("\nInsira seu salário atual: ");
            sal = sc.nextDouble();

            if (sal < 400) {
                sal = sal + 100;
            } else if (sal < 750) {
                sal = sal + 75;
            } else if (sal < 1500) {
                sal = sal + 50;
            } else {
                sal = sal + 25;
            }
            
            System.out.print("\nSeu novo salário será de: " + sal);
            
        } else if (op == 3) {
            System.out.print("\nInsira seu salário atual: ");
            sal = sc.nextDouble();

            if (sal <= 700) {
                System.out.print("\nVocê está sendo mal remunerado!");
            } else {
                System.out.print("\nVocê está sendo bem remunerado!");
            }
        }

        sc.close();
    }
}