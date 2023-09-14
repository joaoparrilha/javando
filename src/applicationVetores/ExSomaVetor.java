package applicationVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExSomaVetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros vc vai digitar? ");
        int n = sc.nextInt();

        double[] vetorNumeros = new double[n];

        // for adicionar valores
        for (int i = 0; i < vetorNumeros.length; i++ ){
            System.out.print("Digite um numero: ");
            vetorNumeros[i] = sc.nextDouble();
        }

        // for valores
        System.out.print("Valores = ");
        for (int i =0; i < vetorNumeros.length; i++){
            System.out.printf("%.1f ",vetorNumeros[i]);
        }

        //for soma
        double soma = 0.0;
        for (int i = 0; i < vetorNumeros.length; i++){
            soma += vetorNumeros[i];
        }
        System.out.printf("%nSoma = %.2f%n", soma);

        // media
        double media = soma / vetorNumeros.length;
        System.out.printf("Media = %.2f", media);

        sc.close();
    }
}
