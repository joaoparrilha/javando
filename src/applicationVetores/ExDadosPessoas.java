package applicationVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExDadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        double[] altura = new double[n];
        char[] genero = new char[n];

        // add valores
        for (int i = 0; i < n; i++){
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            genero[i] = sc.next().charAt(0);
        }

        //maior e menor altura
        double menorAltura = 3.0;
        double maiorAltura = 0.0;
        for (int i = 0; i < n; i++){
            if (altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
            if (altura[i] < menorAltura){
                menorAltura = altura[i];
            }
        }

        //media mulheres e numero de homens
        double soma = 0.0;
        int qtdeMulheres = 0;
        int qtdeHomens = 0;

        for (int i = 0; i < n; i++){
            if(genero[i] == 'F'){
                soma += altura[i];
                qtdeMulheres += 1;
            }
            if(genero[i] == 'M'){
                qtdeHomens += 1;
            }
        }

        double media = soma / qtdeMulheres;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", media);
        System.out.printf("Numero de homens = %d", qtdeHomens);



        sc.close();
    }
}
