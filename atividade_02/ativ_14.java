package aula_02;
import java.util.Scanner;
public class ativ_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantidade da ra��o comprada em Kg: ");
        double racaoKg = sc.nextDouble();
        
        System.out.print("Quantidade da ra��o fornecida aos gatos em gramas: ");
        double racaoGato = sc.nextDouble();
        
        double racaoRestante = racaoKg - ((racaoGato / 1000) * 5);
        
        System.out.println("Ra��o restante no pacote: " + racaoRestante + "Kg");
        
        sc.close();
	}

}
