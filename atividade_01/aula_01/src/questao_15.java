package aula_01;

import java.util.Scanner;

public class questao_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Num 1: ");
        int num1 = sc.nextInt();
        System.out.print("Num 2: ");
        int num2 = sc.nextInt();
        
        System.out.println("M�DIA: " + ((num1 + num2)/2));
    }
}
