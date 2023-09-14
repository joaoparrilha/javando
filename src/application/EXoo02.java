package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class EXoo02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();


        // pegar os dados iniciais
        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();
        //printar cliente inicial, chamado o override toString sem 'declarar'
        System.out.println("Employee: " + emp);


        System.out.print("Which percentage to increase salary?");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        System.out.println("Update data: " + emp);

        sc.close();
    }
}
