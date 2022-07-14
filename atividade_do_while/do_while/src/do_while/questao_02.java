package do_while;

import java.util.Scanner;

public class questao_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	        int contCid = 0, cod, numV , acid, somaV = 0, somaVM = 0, cidM = 0, maior = 0, menor = 999999999, somaA = 0, codMenor = 0, codMaior = 0;

	        do {
	            System.out.print("Informe o código da cidade"
	            		+ "\n(de 1 a 5): ");
	            cod = sc.nextInt();
	            
	            System.out.print("Informe o números de veículos de passeio: ");
	            numV = sc.nextInt();
	            
	            System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
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

	        System.out.println("Na cidade com o código " + codMaior +  ", o maior índice de acidente é " + (maior * 100)/somaA);
	        	System.out.println("Na cidade com o código " + codMenor + ", o menor índice de acidente é " + (menor * 100)/somaA);
	        		System.out.println("A média de veículos das cidades é: " + (somaV / 5));
	        			System.out.println("A média de acidentes de trânsito em cidades com menos de 2000 veículos é: " + (somaVM / cidM));
	    
		sc.close();
		}
	}
