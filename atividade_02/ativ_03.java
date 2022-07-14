package aula_02;

import java.util.Scanner;

public class ativ_03 {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        
        System.out.print("Digite um número que não seja zero: ");
        int num1 = sc.nextInt();
                
        System.out.print("\nDigite outro número: ");
        int num2 = sc.nextInt();        

        System.out.print("\nO resultado é: " +(num1 / num2));
        
        sc.close();
    }

}