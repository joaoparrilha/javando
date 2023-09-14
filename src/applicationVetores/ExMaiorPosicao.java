package applicationVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExMaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double [] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        double maiorValor = 0.0;
        int indexValor = 0;
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > maiorValor){
                maiorValor = vetor[i];
                indexValor = i;
            }
        }

        System.out.printf("Maior valor = %.1f%n", maiorValor);
        System.out.println("Posicao do maior valor = " + indexValor);




        sc.close();
    }
}
