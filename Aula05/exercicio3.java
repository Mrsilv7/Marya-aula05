package Aula05;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Código do produto (1, 2 ou 3): ");
        int codigo = sc.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Categoria: Eletrônicos");
                break;
            case 2:
                System.out.println("Categoria: Alimentos");
                break;
            case 3:
                System.out.println("Categoria: Vestuário");
                break;
            default:
                System.out.println("Código de produto não reconhecido.");
        }

        sc.close();
    }
}
