package aula_03;

import java.util.Scanner;

public class ativ_4 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Digite outro n�mero: ");
		double num2 = sc.nextDouble();
		
		System.out.print("Digite mais um n�mero: ");
		double num3 = sc.nextDouble();
		
		double prim = 0, seg = 0, terc = 0;
        
        if(num1 > num2 && num1 > num3) {
            prim = num1;
        }
        
        if(num2 > num1 && num2 > num3) {
            prim = num2;
        }
        
        if(num3 > num1 && num3  > num2) {
            prim = num3;
        }
        
        
        
        
        if(num1 > num2 && num1 < num3 || num1 < num2 && num1 > num3) {
            seg = num1;
        }
        
        if(num2 > num1 && num2 < num3 || num2 < num1 && num2 > num3) {
            seg = num2;
        }
        
        if(num3 > num2 && num3 < num1 || num3 < num2 && num3 > num1) {
            seg = num3;
        }
        
     
        
        
        if(num1 < num2 && num1 < num3) {
            terc = num1;
        }
        
        if(num2 < num1 && num2 < num3) {
            terc = num2;
        }
        
        if(num3 < num1 && num3  < num2) {
            terc = num3;
        }
        
        System.out.print("\nA ordem crescente: " + terc + ", " + seg + ", " + prim);
	}

}
