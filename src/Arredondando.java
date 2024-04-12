import java.util.Scanner;

public class Arredondando {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE UM VALOR COM PONTO FLUTUANTE: ");

        double value1 = Math.ceil(sc.nextDouble());

        double value2 = Math.floor(sc.nextDouble());

        double value3 = Math.round(Math.random() * 100);

        int value4 = (int)Math.round(Math.random() * 100);

        System.out.println("O VALOR DIGITADO FOI ARREDONDADO PARA: " + value1);
        System.out.println("O VALOR DIGITADO FOI ARREDONDADO PARA: " + value2);
        System.out.println("----------------------------------------");

        System.out.println("O SEGUINTE VALOR FOI GERADO AUTOMATICAMENTE E MULTIPLICADO POR 100: " + value3);
        System.out.println("O SEGUINTE VALOR FOI GERADO AUTOMATICAMENTE E MULTIPLICADO POR 100: " + value4);

    }
}
