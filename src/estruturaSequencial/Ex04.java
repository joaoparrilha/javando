package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int numeroFuncionario;
        int horasTrabalhadas;
        double valorHora;
        Scanner sc = new Scanner(System.in);
        numeroFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorHora = sc.nextDouble();

        Locale.setDefault(Locale.US);
        double salario = horasTrabalhadas * valorHora;

        System.out.printf("NUMBER = %d%n" +
                "SALARY = U$ %.2f", numeroFuncionario, salario);

        sc.close();
    }
}
