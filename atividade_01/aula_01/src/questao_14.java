package aula_01;

import java.util.Scanner;

public class questao_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Num 1: ");
        int num1 = sc.nextInt();
        
        System.out.println("Ter�a parte de " + num1  + " � " + (num1 / 3));
    }
}
