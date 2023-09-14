package applicationVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExMaisVelho {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];

        // add valores
        for (int i = 0; i < nomes.length; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        int maiorIdade = 0;
        int indexNome = 0;
        for (int i =0; i < nomes.length; i++){
            if(idades[i] > maiorIdade){
                maiorIdade = idades[i];
                indexNome = i;
            }
        }

        System.out.println("Pessoa mais velha: " + nomes[indexNome]);



        sc.close();
    }
}
