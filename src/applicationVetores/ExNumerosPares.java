package applicationVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExNumerosPares {
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
        System.out.println("Numeros Pares: ");
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0) {
                System.out.printf("%d ",numeros[i]);
                qtdPares += 1;
            }
        }
        System.out.println();
        System.out.println("Quantidade de pares: " + qtdPares);


        sc.close();
    }
}
