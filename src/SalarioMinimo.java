/*Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$1400,00)
*/

import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioMinimo = 1400;

        System.out.println("Digite o valor do seu salário: ");
        double salarioUsuario = sc.nextDouble();

        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        System.out.printf("Você ganha %.2f salários mínimos.", quantidadeSalariosMinimos);
    }
}