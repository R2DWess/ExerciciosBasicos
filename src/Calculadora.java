import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE DOIS VALORES: ");
        double primeiroValor = sc.nextDouble();
        double segundoValor = sc.nextDouble();

        double soma = primeiroValor + segundoValor;
        double sub = primeiroValor - segundoValor;
        double div = primeiroValor / segundoValor;
        double mult = primeiroValor * segundoValor;

        System.out.println("A soma dos valores digitados é: " + soma);
        System.out.println("A subtração dos valores digitados é: " + sub);
        System.out.println("A divisão dos valores digitados é: " + div);
        System.out.println("A multiplicação dos valores digitados é: " + mult);

    }
}
