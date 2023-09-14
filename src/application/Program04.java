package application;

import util.Calculator;
import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollar will be bought? ");
        double totalDollar = sc.nextDouble();

        double total = CurrencyConverter.amount(dollarPrice, totalDollar);

        System.out.printf("Amount to be paid in reais = %.2f", total);

        sc.close();
    }
}
