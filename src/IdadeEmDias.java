import java.util.Scanner;

/* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
 * mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
 * (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade em anos: ");
        int anos = sc.nextInt();

        System.out.println("Digite sua idade em meses: ");
        int meses = sc.nextInt();

        System.out.println("Digite sua idade em dias: ");
        int dias = sc.nextInt();

        int totalDias = anos * 365 + meses * 30 + dias;

        System.out.println("A idade de " + anos + " anos, " + meses + " meses e " + dias + " dias é igual a " + totalDias + " dias.");
    }
}
