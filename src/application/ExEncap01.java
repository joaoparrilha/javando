package application;

import entities.BankClient;

import java.util.Locale;
import java.util.Scanner;

public class ExEncap01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankClient account;


        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char answer = sc.next().charAt(0);
        if (answer == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new BankClient(accountNumber, holder, initialDeposit);
        } else {
            account = new BankClient(accountNumber, holder);
        }

        System.out.println("Account data: ");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double newDeposit = sc.nextDouble();
        account.deposite(newDeposit);
        System.out.println("Update account data: ");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        double withDraw = sc.nextDouble();
        System.out.println("Update account data: ");
        account.withDraw(withDraw);
        System.out.println(account);

        sc.close();
    }
}
