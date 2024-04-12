import java.util.Scanner;

public class CalculoIPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // classe de entrada de dados

        System.out.println("Digite a porcentagem do IPI: ");
        double ipi = sc.nextDouble(); // variável IPI que receberá um valor double

        System.out.println("Digite o código da peça 1, valor unitário e quantidade: ");
        int primeiroCodigo = sc.nextInt(); // variável 'codigo1' que receberá um valor int
        double primeiroValor = sc.nextDouble(); // variável 'valor1' que receberá um valor double
        int quantidadeUm = sc.nextInt(); // variável 'quant1' que receberá um valor int

        System.out.println("Digite o código da peça 2, valor unitário e quantidade: ");
        int segundoCodigo = sc.nextInt(); // variável 'codigo2' que receberá um valor int
        double segundoValor = sc.nextDouble(); // variável 'valor2' que receberá um valor double
        int quantidadeDois = sc.nextInt(); // variável 'quant2' que receberá um valor int

        double total = (primeiroValor * quantidadeUm + segundoValor * quantidadeDois) * (ipi / 100 + 1);
        // variável 'total' que faz o calculo '(valor1*quant1 + valor2*quant2)*(IPI/100 + 1)'

        System.out.printf("O valor total a ser pago é: %.2f", total);
        // impressao de uma mensagem acrescida do resultado do valor da variável 'total'
    }
}