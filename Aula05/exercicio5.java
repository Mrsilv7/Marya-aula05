package Aula05;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Horas trabalhadas: ");
        double horas = sc.nextDouble();
        System.out.print("Valor da hora normal (R$): ");
        double valorHora = sc.nextDouble();

        if (horas > 40) {
            double horasExtras = horas - 40;
            double valorExtra = horasExtras * valorHora * 1.5;
            System.out.printf("Horas extras: %.1f%n", horasExtras);
            System.out.printf("Valor a pagar pelas horas extras: R$ %.2f%n", valorExtra);
        } else {
            System.out.println("O funcionário não fez horas extras.");
        }

        sc.close();
    }
}