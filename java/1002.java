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

        Double raio, area;
        final Double PI = 3.14159;

        raio = in.nextDouble();

        area = PI * (raio*raio);

        System.out.println("A=%.4f".formatted(area));
    }

}