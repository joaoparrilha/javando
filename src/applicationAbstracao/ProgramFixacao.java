package applicationAbstracao;

import entitiesAbstracao.Company;
import entitiesAbstracao.Individual;
import entitiesAbstracao.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramFixacao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<Person> people = new ArrayList<>();

        for(int i =1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data");
            System.out.print("Individual or Company (i/c)? ");
            char personType = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (personType == 'i') {
                System.out.print("Health expenditures: ");
                double expenditures = sc.nextDouble();
                people.add(new Individual(name, anualIncome, expenditures));
            } else {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                people.add(new Company(name, anualIncome, employees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        for (Person p : people){
            System.out.printf("%s: $ %.2f%n", p.getName(), p.taxes());
        }

        double totalTaxes = 0.0;
        for (Person p : people){
            totalTaxes += p.taxes();
        }
        System.out.println("TOTAL TAXES: $ " + totalTaxes);


    }
}
