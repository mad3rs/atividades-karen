package aula_01;

import java.util.Scanner;

public class questao_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a base: ");
        double base = sc.nextDouble();
        System.out.print("Informe a altura: ");
        double altura = sc.nextDouble();
        
        System.out.println("Perímetro: " + ((base * 2) + (altura*2)));
        System.out.println("Área: " + (base * altura));
    }
}