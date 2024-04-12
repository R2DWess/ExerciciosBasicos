import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        while (true) {
            System.out.println("Digite um valor positivo: ");
            System.out.println("Para sair digite um número negativo: ");

            if (numero < 0) {
                break;
            }

            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par.");
            } else {
                System.out.println("O número " + numero + " é ímpar.");
            }
        }

        sc.close();
    }
}