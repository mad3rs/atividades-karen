package aula_01;

import java.util.Scanner;

public class questao_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double media1 = (8+9+7)/3;
        double media2 = (4+5+6)/3;
        double somaMedias = media1 + media2;
        double mediaMedias = (media1 + media2) / 2;
        
        System.out.println("M�dia 1: " + media1);
        System.out.println("M�dia 2: " + media2);
        System.out.println("Soma das m�dias: " + somaMedias);
        System.out.println("M�dia das medias: " + mediaMedias);
    }
}