import java.util.Random;
import java.util.Scanner;
public class AdivinheNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 0;

        while (true) {
            System.out.println("Faça um palpite (entre 1 e 100): ");
            int palpite = sc.nextInt();
            tentativas++;

            if (palpite > numeroAleatorio) {
                System.out.println("Muito alto! Tente novamente.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você adivinhou o número em " + tentativas + " tentativas.");
                break;
            }
        }

        sc.close();
    }
}