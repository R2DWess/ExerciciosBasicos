import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrdemArray {
    public static void main(String[] args) {

        int[] primeiroArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        String[] segundoArray = {
                "java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"

        };

        System.out.println("Primeiro Array - COMUM" + Arrays.toString(primeiroArray));
        Arrays.sort(primeiroArray);
        System.out.println("Primeiro Array - ORDEM" + Arrays.toString(primeiroArray));


        System.out.println("Segundp Array - COMUM" + Arrays.toString(segundoArray));
        Arrays.sort(segundoArray);
        System.out.println("Segundp Array - ORDEM" + Arrays.toString(segundoArray));
    }
}
