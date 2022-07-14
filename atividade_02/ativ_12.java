package aula_02;
import java.util.Scanner;

public class ativ_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double custo, ing, alcan;

        System.out.println("Digite o valor do custo do espetáculo: ");
        custo = sc.nextDouble();

        System.out.println("Digite o valor do ingresso: ");
        ing = sc.nextDouble();

        alcan=custo/ing;
        System.out.printf("Quantidade de ingressos vendidos para que o custo seja alcançado: %.2f", alcan);

        sc.close();
    }}