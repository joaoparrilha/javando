package applicationVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExMediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int [] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        int qtdPares = 0;
        double soma = 0.0;

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0) {
                soma += numeros[i];
                qtdPares += 1;
            }
        }
        if (qtdPares == 0){
            System.out.println("Nenhum numero par");
        } else {
            System.out.printf("Media dos pares = %.1f", soma/qtdPares);
        }

        sc.close();
    }
}
