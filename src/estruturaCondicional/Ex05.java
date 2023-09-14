package estruturaCondicional;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        double cachorroQuente = 4.0;
        double xSalada = 4.50;
        double xBacon = 5.00;
        double torradaSimples = 2.00;
        double refrigerante = 1.50;

        Scanner sc = new Scanner(System.in);
        int item, quantidade;
        item = sc.nextInt();
        quantidade = sc.nextInt();

        double calculo;
        if (item == 1){
            calculo = quantidade * cachorroQuente;
            System.out.println("Total: R$" + calculo);
        } else if (item == 2){
            calculo = quantidade * xSalada;
            System.out.println("Total: R$" + calculo);
        } else if (item == 3){
            calculo = quantidade * xBacon;
            System.out.println("Total: R$" + calculo);
        } else if (item == 4) {
            calculo = quantidade * torradaSimples;
            System.out.println("Total: R$" + calculo);
        } else {
            calculo = quantidade * refrigerante;
            System.out.println("Total: R$" + calculo);
        }

        sc.close();
    }
}
