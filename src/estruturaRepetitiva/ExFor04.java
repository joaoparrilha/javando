package estruturaRepetitiva;

import java.util.Scanner;

public class ExFor04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i ++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if (num2 == 0){
                System.out.println("divisao impossivel");
            } else {
                System.out.println((double)num1/num2);
            }
        }

        sc.close();
    }
}
