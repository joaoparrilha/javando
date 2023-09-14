package estruturaSequencial;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner sc = new Scanner (System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int diferenca = a*b - c*d;
        System.out.println("DIFERENCA = " + diferenca);
        sc.close();
    }
}
