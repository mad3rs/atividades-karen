package quiz_copa;

import java.util.Scanner;

public class codigo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int chances = 0;
		String p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;

		System.out.print("Vamos testar seus conhecimentos sobre a copa do mundo.");

		System.out.print("\n\n1.Qual foi o primeiro país a ganhar a copa do mundo?"
				+ "\na) Brasil"
				+ "\nb) Uruguai"
				+ "\nc) Itália"
				+ "\nd) Japão"
				+ "\nresposta: ");
		p1 = sc.next();

		System.out.print("\n2.Qual desses países nunca ganhou uma copa do mundo?"
				+ "\na) Portugual"
				+ "\nb) Austrália"
				+ "\nc) França"
				+ "\nd) Croácia"
				+ "\nrespota: ");
		p2 = sc.next();

		System.out.print("\n3.Qual país possui o maior título de copas do mundo?"
				+ "\na) França"
				+ "\nb) Estados Unidos"
				+ "\nc) Brasil"
				+ "\nd) Bélgica"
				+ "\nrespota: ");
		p3 = sc.next();

		System.out.print("\n4.Quando ocorreu a primeira copa do mundo?"
				+ "\na) 2000"
				+ "\nb) 1960"
				+ "\nc) 1994"
				+ "\nd) 1930"
				+ "\nrespota: ");
		p4 = sc.next();

		System.out.print("\n5.Qual o jogador que mais ganhou copas do mundo?"
				+ "\na) Cristiano Ronaldo"
				+ "\nb) Pelé"
				+ "\nc) Romário"
				+ "\nd) Dunga"
				+ "\nresposta: ");
		p5 = sc.next();

		System.out.print("\n6.Onde foi sediada a primeira copa do mundo?"
				+ "\na) Brasil"
				+ "\nb) Estados Unidos"
				+ "\nc) Uruguai"
				+ "\nd) México"
				+ "\nresposta: ");
		p6 = sc.next();

		System.out.print("\n7.Quantas copas foram sediadas na África?"
				+ "\na) 1"
				+ "\nb) 2"
				+ "\nc) 3"
				+ "\nd) 4"
				+ "\nrespota: ");
		p7 = sc.next();

		System.out.print("\n8.Quantos times sul-americanos ganharam a copa?"
				+ "\na) 4"
				+ "\nb) 3"
				+ "\nc) 2"
				+ "\nd) 1"
				+ "\nrespota: ");
		p8 = sc.next();

		System.out.print("\n9.Onde será a copa de 2022?"
				+ "\na) República Tcheca"
				+ "\nb) Irlanda"
				+ "\nc) Índia"
				+ "\nd) Qatar"
				+ "\nrespota: ");
		p9 = sc.next();

		System.out.print("\n10.Quem é o maior artilheiro da copa do mundo?"
				+ "\na) Neymar"
				+ "\nb) Klose"
				+ "\nc) Messi"
				+ "\nd) Pelé"
				+ "\nrespota: ");
		p10 = sc.next();

		if (p1.equals("Uruguai") || p1.equals("b")) {
			chances = chances + 10;
		}
		if (p2.equals("Portugal") || p2.equals("a")) {
			chances = chances + 10;
		}
		if (p3.equals("Brasil") || p3.equals("c")) {
			chances = chances + 10;
		}
		if (p4.equals("1930") || p4.equals("d")) {
			chances = chances + 10;
		}
		if (p5.equals("Pelé") || p5.equals("b")) {
			chances = chances + 10;
		}
		if (p6.equals("Uruguai") || p6.equals("c")) {
			chances = chances + 10;
		}
		if (p7.equals("1") || p7.equals("a")) {
			chances = chances + 10;
		}
		if (p8.equals("3") || p8.equals("b")) {
			chances = chances + 10;
		}
		if (p9.equals("Qatar") || p9.equals("d")) {
			chances = chances + 10;
		}
		if (p10.equals("Klose") || p9.equals("b")){
			chances = chances + 10;
		}

		System.out.println("------------------------------------------------"
				+"\nVocê teve: " + chances + "% de acerto");

		if (chances <= 20) {
			System.out.println("\nFutebol não é a sua área.");
		} else {
			if (chances <= 40) {
				System.out.println("\nQuase lá! Você leva jeito.");
			} else {
				if (chances <= 60) {
					System.out.println("\nHá um boleiro dentro de você.");
				} else {
					if (chances <= 80) {
						System.out.println("\nParabéns, você entende muito de futebol.");
					} else {
						if (chances == 100) {
							System.out.println("\nIncrível!! Você é um amante de copas do mundo!!!");
						} else {
						}

						sc.close();
					}
				}
			}
		}
	}
}
