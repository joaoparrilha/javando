package applicationVetores;

import entitiesVetores.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class ExAlturas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Pessoas[] vetorPessoas = new Pessoas[n];

        // add pessoas
        for (int i = 0; i < n; i++){
            System.out.printf("Dados da %da pessoa: %n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vetorPessoas[i] = new Pessoas(nome, idade, altura);
        }

        // somando alturas e calculando a media
        double soma =0.0;
        for (int i =0; i < vetorPessoas.length; i++) {
            soma += vetorPessoas[i].getAltura();
        }

        double media = soma/ vetorPessoas.length;
        System.out.printf("Altura media: %.2f%n", media);

        // pessoas com menos de 16 anos
        String[] pessoas16 = new String[n];
        for (int i =0; i< vetorPessoas.length; i++){
            if (vetorPessoas[i].getIdade() < 16){
                pessoas16[i] = vetorPessoas[i].getNome();
            }
        }
        // porcentagem
        int pessoasMenos16 = 0;
        for (int i = 0; i < pessoas16.length; i++){
            if(pessoas16[i] != null){
                pessoasMenos16 += 1;
            }
        }
        double porcentagem = pessoasMenos16 * 100.0 / vetorPessoas.length;
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");

        for (int i = 0; i < pessoas16.length; i++){
            if (pessoas16[i] != null){
                System.out.println(pessoas16[i]);
            }
        }

        sc.close();
    }
}
