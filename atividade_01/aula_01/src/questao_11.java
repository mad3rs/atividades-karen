package aula_01;

import java.util.Scanner;

public class questao_11 {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        String nome, end, tel;
	        
	        System.out.print("Nome: ");
	        nome = sc.next();
	        System.out.print("Endereço: ");
	        end = sc.next();
	        System.out.print("Telefone: ");
	        tel = sc.next();
	        
	        System.out.print("Nome: " + nome);
	        System.out.print("Endereço: " + end);
	        System.out.print("Telefone: " + tel);
	    }
	}
