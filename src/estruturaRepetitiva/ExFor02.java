package estruturaRepetitiva;

import java.util.Scanner;

public class ExFor02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdValores = sc.nextInt();
        int valores;
        int in = 0;
        int out = 0;

        for (int i = 0; i < qtdValores; i++){
            valores = sc.nextInt();
            if(valores >= 10 && valores <= 20){
                in += 1;
            } else {
                out += 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}
