package aula_02;

import java.util.Scanner;

public class ativ_02 {

    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
        
        System.out.print("Digite um n�mero: ");
        int num1 = sc.nextInt();
                
        System.out.print("\nDigite outro n�mero: ");
        int num2 = sc.nextInt();
        
        System.out.print("\nDigite o �ltimo n�mero: ");
        int num3 = sc.nextInt();
        
        System.out.print("\nO resultado �: " +(num1 * num2 * num3));
        
        sc.close();
    }

}
