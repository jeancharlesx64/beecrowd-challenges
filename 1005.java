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

        Double A, B, MEDIA;

        A = in.nextDouble();
        B = in.nextDouble();

        MEDIA = ((A*3.5) + (B*7.5)) / 11;

        System.out.println("MEDIA = %.5f".formatted(MEDIA));
    }

}