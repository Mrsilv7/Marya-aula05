package Aula05;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor das vendas (R$): ");
        double vendas = sc.nextDouble();
        double percentual;

        if (vendas < 1000) {
            percentual = 0.05;
        } else if (vendas <= 5000) {
            percentual = 0.10;
        } else {
            percentual = 0.15;
        }

        double comissao = vendas * percentual;
        System.out.printf("Comissão de %.0f%%: R$ %.2f%n", percentual * 100, comissao);

        sc.close();
    }
}