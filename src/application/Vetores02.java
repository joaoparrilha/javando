package application;

import entities.ProductVetor;

import java.util.Locale;
import java.util.Scanner;

public class Vetores02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ProductVetor[] vetor = new ProductVetor[n];

        for (int i = 0; i< vetor.length ; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vetor[i] = new ProductVetor(name, price);
        }

        double soma = 0.0;
        for(int i = 0; i < n; i++){
            soma += vetor[i].getPrice();
        }

        double media = soma / vetor.length;

        System.out.printf("A media é: %.2f%n", media);




        sc.close();
    }

}
