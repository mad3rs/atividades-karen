package aula_02;
import java.util.Scanner;

public class ativ_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double  salario_min, quilowatt, valor_quilowatt,valor_pago,valor_desc;

        System.out.println("Digite o valor do salário mínimo: ");
        salario_min = sc.nextDouble();

        System.out.println("Digite a quantidade de quilowatts consumida: ");
        quilowatt = sc.nextDouble();

        valor_quilowatt= salario_min/5;
        System.out.println("valor de cada quilowatts: "+valor_quilowatt);
        valor_pago=quilowatt*valor_quilowatt;
        System.out.println("valor a ser pago: "+valor_pago);
        valor_desc= valor_pago-(valor_pago*0.15);
        System.out.println("valor a ser pago com desconto: "+valor_desc);

        sc.close();
    }
}