package Aula05;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra (R$): ");
        double valor = sc.nextDouble();
        double valorFinal = valor;

        if (valor > 100) {
            valorFinal = valor * 0.90;
            System.out.println("Desconto de 10% aplicado!");
        } else {
            System.out.println("Sem desconto.");
        }

        System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);

        sc.close();
    }
}