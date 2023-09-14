package applicationVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExSomaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        int[] vetorA = new int[n];
        int[] vetorB = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = sc.nextInt();
        }

        int[] vetorSoma = new int[n];
        for (int i = 0; i < vetorSoma.length; i++){
            vetorSoma[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("Vetor Resultante: ");
        for (int i =0; i < vetorSoma.length; i++){
            System.out.println(vetorSoma[i]);
        }


        sc.close();
    }
}
