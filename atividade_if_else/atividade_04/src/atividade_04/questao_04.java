package atividade_04;

import java.util.Scanner;

public class questao_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int HI, MI, HT, MT, DM, DH;
		
        System.out.print("Informe o hor�rio de in�cio do jogo: ");
        System.out.print("\nQual a Hora: ");
        HI = sc.nextInt();
        
        System.out.print("E o minuto: ");
        MI = sc.nextInt();
        
        System.out.print("\nInforme o hor�rio de t�rmino do jogo: ");
        System.out.print("\nQual a Hora: ");
        HT = sc.nextInt();
        
        System.out.print("E o minuto: ");
        MT = sc.nextInt();

        DH = HT - HI;
        
        DM = MT - MI;

        if (DH < 0){
            DH = 24 + DH;
        }else if (DM < 0){
            DH = DH - 1;
            DM = 60 + DM;
        }

        System.out.print("\nA dura��o da partida � de: " + DH + ":" + DM);

        sc.close();
    }
}