package estruturaCondicional;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        int horaInicial, horaFinal;
        Scanner sc = new Scanner(System.in);

        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        int duracao;
        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + "HORA(S)");

    }

}
