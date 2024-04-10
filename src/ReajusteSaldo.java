/*. Informar um saldo e imprimir o saldo com reajuste de 1%.*/

import java.util.Scanner;

public class ReajusteSaldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o saldo");
        double saldo = sc.nextDouble();
        double reajuste = saldo * 0.01;
        double novoSaldo = saldo + reajuste;

        System.out.printf("O novo saldo com acréscimo de 1%% é: %.2f", + novoSaldo);

        sc.close();
    }
}
