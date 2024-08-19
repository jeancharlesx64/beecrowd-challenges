/*
==================================
=          Jean Charles          =
==================================
 */
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        Integer A,B, SOMA;

        A = in.nextInt();
        B = in.nextInt();

        SOMA = A+B;

        System.out.println("SOMA = %s".formatted(SOMA));
    }

}