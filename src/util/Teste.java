package util;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double [] vetor = new double[n];

        for (int i=0; i < n; i++){
            vetor[i] = sc.nextDouble();
        }





        sc.close();
    }
}
