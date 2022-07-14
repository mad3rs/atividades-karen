package atividade_04;

import java.util.Scanner;

public class questao_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int D1, M1, A1, ND1, D2, M2, A2, ND2;
        
        System.out.println("Informe a primeira data: ");
        System.out.print("Dia: ");
        D1 = sc.nextInt();
        
        System.out.print("Mês: ");
        M1 = sc.nextInt();
        
        System.out.print("Ano: ");
        A1 = sc.nextInt();
        
        ND1 = (A1 * 365) + (M1 * 30) + D1;

        System.out.println("Informe a segunda data: ");
        System.out.print("Dia: ");
        D2 = sc.nextInt();
        
        System.out.print("Mês: ");
        M2 = sc.nextInt();
        
        System.out.print("Ano: ");
        A2 = sc.nextInt();
        
        ND2 = (A2 * 365) + (M2 * 30) + D2;

        if(ND1 < ND2){
            System.out.print("\nA 1ª data vem antes");
        } else if(ND2 < ND1){
            System.out.print("\nA 2ª data vem antes");
        } else {
            System.out.print("\nAs datas são iguais");
        }
        
        sc.close();
    }
}