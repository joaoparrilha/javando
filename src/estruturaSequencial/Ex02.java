package estruturaSequencial;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        double raio;
        Scanner sc = new Scanner(System.in);

        raio = sc.nextDouble();
        double formula = 3.14159 * Math.pow(raio, 2);

        System.out.printf("A = %.4f", formula);

        sc.close();
    }
}
