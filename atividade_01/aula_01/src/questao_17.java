package aula_01;

import java.util.Scanner;

public class questao_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o raio: ");
        double raio = sc.nextDouble();

        
        System.out.println("Per�metro: " + (2 * 3.14 * raio));
        System.out.println("�rea: " + (3.14 * (raio * raio)));
    }
}
