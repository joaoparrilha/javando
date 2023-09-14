package estruturaRepetitiva;

import java.util.Scanner;

public class ExFor07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++ ){
            System.out.println(i + " " + Math.pow(i, 2) + " " + Math.pow(i, 3));
        }

        sc.close();
    }
}
