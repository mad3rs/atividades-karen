import java.util.Scanner;

public class questao_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
	    double salTot = 0, pecasHom=0, pecasMul=0, sal, maiorSal = 0;
	    int cod, qntPecas, codOpMaiorSal = 0, contHomem = 0, contMulher = 0, pecaTotal = 0;
	    String gen;

	    System.out.print("Digite o sal�rio m�nimo: ");
	    double salarioMinimo = sc.nextDouble();

	    System.out.print("\n");
	    
	    for (int i = 1; i <= 3; i++){
	        System.out.print("Digite seu c�digo: ");
	        cod = sc.nextInt();

	        System.out.print("Digite a quantidade de pe�as que voc� fez: ");
	        qntPecas = sc.nextInt();

	        System.out.print("Digite seu g�nero: ");
	        gen = sc.next();

	        if(qntPecas <= 30){
	        	sal = salarioMinimo;
	        } else if(qntPecas <= 50){
	        	sal = salarioMinimo + ((salarioMinimo * 0.03) * (qntPecas-30));
	        } else {
	        	sal = salarioMinimo + ((salarioMinimo * 0.05) * (qntPecas-30));
	        }

	        if(i == 1){
	            maiorSal = sal;
	            codOpMaiorSal = cod;
	        } else {
	            if(sal > maiorSal){
	                maiorSal = sal;
	                codOpMaiorSal = cod;
	            }
	        }

	        if(gen.equals("homem")){
	        	contHomem++;
	            pecasHom += qntPecas;
	        } else {
	        	contMulher++;
	            pecasMul += qntPecas;
	        }

	        salTot += sal;
	        pecaTotal += qntPecas;

	        System.out.print("------------\n");
	        System.out.print("C�digo: " + cod);
	        System.out.print("\nSal�rio: " + sal + "\n----------\n\n");
	    }

	    System.out.print("Total de sal�rios: " + salTot);
	    System.out.print("\nTotal de pe�as produzidas: " + pecaTotal);
	    System.out.print("\nM�dia de pe�as fabricadas por homens: " + (pecasHom / contHomem));
	    System.out.print("\nM�dia de pe�as fabricada por mulheres: " + (pecasMul / contMulher));

	    System.out.print("\n\nC�digo do oper�rio com maior sal�rio: " +codOpMaiorSal);
	    
	    sc.close();
	}
	}
