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

        Double A, B, C, MEDIA;

        A = in.nextDouble();
        B = in.nextDouble();
        C = in.nextDouble();

        MEDIA = ((A*2) + (B*3) + (C*5)) / 10;

        System.out.println("MEDIA = %.1f".formatted(MEDIA));
    }

}