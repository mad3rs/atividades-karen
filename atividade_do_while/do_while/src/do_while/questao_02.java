package do_while;

import java.util.Scanner;

public class questao_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	        int contCid = 0, cod, numV , acid, somaV = 0, somaVM = 0, cidM = 0, maior = 0, menor = 999999999, somaA = 0, codMenor = 0, codMaior = 0;

	        do {
	            System.out.print("Informe o c�digo da cidade"
	            		+ "\n(de 1 a 5): ");
	            cod = sc.nextInt();
	            
	            System.out.print("Informe o n�meros de ve�culos de passeio: ");
	            numV = sc.nextInt();
	            
	            System.out.print("Informe o n�mero de acidentes de tr�nsito com v�timas: ");
	            acid = sc.nextInt();

	            if (numV < 2000) {
	            	cidM++;
	                somaVM += acid;
	            }
	            if (acid < menor) {
	            	codMenor = cod;
	                menor = acid;
	            }
	            if (acid > maior) {
	            	codMaior = cod;
	                maior = acid;
	            }
	            somaA += acid;
	            somaV += numV;
	            contCid++;
	        } while (contCid <= 4);

	        System.out.println("Na cidade com o c�digo " + codMaior +  ", o maior �ndice de acidente � " + (maior * 100)/somaA);
	        	System.out.println("Na cidade com o c�digo " + codMenor + ", o menor �ndice de acidente � " + (menor * 100)/somaA);
	        		System.out.println("A m�dia de ve�culos das cidades �: " + (somaV / 5));
	        			System.out.println("A m�dia de acidentes de tr�nsito em cidades com menos de 2000 ve�culos �: " + (somaVM / cidM));
	    
		sc.close();
		}
	}
