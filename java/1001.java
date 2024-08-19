/*
==================================
=          Jean Charles          =
==================================
 */
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Integer A, B, X;

        Scanner in = new Scanner(System.in);

        A = in.nextInt();
        B = in.nextInt();

        X = A+B;

        System.out.println("X = %s".formatted(X));
    }

}