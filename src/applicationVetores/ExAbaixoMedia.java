package applicationVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExAbaixoMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double [] notas = new double[n];

        for (int i = 0; i < notas.length; i++){
            System.out.print("Digite uma nota: ");
            notas[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i< notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.printf("Media do vetor = %.3f%n", media);

        System.out.println("Elementos abaixo da media: ");
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] < media) {
                System.out.println(notas[i]);
            }
        }

        sc.close();
    }
}
