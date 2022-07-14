package aula_01;

import java.util.Scanner;

public class questao_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a Base Triângulo: ");
        double base = sc.nextDouble();
        System.out.print("Informe a Altura: ");
        double altura = sc.nextDouble();
        
        System.out.println("Área: " + ((base * altura)/2));
    }
}
