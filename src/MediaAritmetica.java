
/* Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
* números 4, 5 e 6. A soma das duas médias. A média das médias.
*/

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {

        int primeiroNumero = 8;
        int segundoNumero = 9;
        int terceitoNumero = 7;

        int primeiraMedia = (8 + 9 + 7) / 2;
        System.out.println("A média dos números 8, 9 e 7 é igual a: " + primeiraMedia);

        int numeroPrimeiro = 4;
        int numeroSegundo = 5;
        int numeroTerceiro = 6;

        int segundaMedia = (4 + 5 + 6) / 2;
        System.out.println("A média dos números 4, 5 e 6 é igual a: " + segundaMedia);

        int somaDaMedia = primeiraMedia + segundaMedia;
        System.out.println("A soma das médias é igual a: " + somaDaMedia);

        int mediaDaMedia = (primeiraMedia + segundaMedia) / 2;
        System.out.println("A média das médias é igual a: " + mediaDaMedia);

    }
}
