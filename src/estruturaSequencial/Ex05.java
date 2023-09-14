package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int codigo1;
        int numeroPecas1;
        double valor1;

        int codigo2;
        int numeroPecas2;
        double valor2;

        Scanner sc = new Scanner(System.in);

        codigo1 = sc.nextInt();
        numeroPecas1 = sc.nextInt();
        valor1 = sc.nextDouble();

        codigo2 = sc.nextInt();
        numeroPecas2 = sc.nextInt();
        valor2 = sc.nextDouble();

        double calculo1 = numeroPecas1 * valor1;
        double calculo2 = numeroPecas2 * valor2;

        double total = calculo1 + calculo2;

        System.out.printf("VALOR A PAGAR : %.2f", total);

        sc.close();
    }
}
