package atividadeswitchcase;

import java.util.Scanner;

public class questao_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double valProd = 5000, valF = 0, valPar = 0, dif;
        int opcPag = sc.nextInt();
        
        System.out.print("Condições de pagamento disponíveis:"
                + "\n1 • Pagamento à vista - 15% de desconto sobre o valor total da compra"
                + "\n2 • Pagamento com cheque pré-datado para 30 dias - 10% de desconto sobre o valor total da compra"
                + "\n3 • Pagamento parcelado em 6 vezes - não tem desconto"
                + "\n4 • Pagamento parcelado em 12 vezes - 8% de acréscimo sobre o valor da compra"
                + "\nR: ");
        

        switch (opcPag) {
        case 1:
        	valF = valProd - (valProd * 0.15);
            break;

        case 2:
        	valF = valProd - (valProd * 0.1);
            break;

        case 3:
        	valF = valProd;
        	valPar = valF / 6;
            System.out.print("\nQuantidade de parcelas: 6");
            System.out.print("\nValor das parcelas: " + valPar);
            break;

        case 4:
        	valF = valProd + (valProd * 0.08);
        	valPar = valF / 12;
            System.out.print("\nQuantidade de parcelas: 12");
            System.out.print("\nValor das parcelas: " + valPar);
            break;
        }

        dif = valF - valProd;

        System.out.print("\nValor da compra: " + valProd + "\nValor final: " + valF);

        if (dif > 0) {
            System.out.print("\nValor do juros: " + dif);
        } else {
            System.out.print("\nValor do desconto: " + dif);
        }

        sc.close();
	}
}