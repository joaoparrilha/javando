package estruturaSequencial;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int c = a + b;
        System.out.println("Soma = " + c);
        sc.close();
    }
}
