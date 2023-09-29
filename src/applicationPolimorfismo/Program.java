package applicationPolimorfismo;

import entitiesPolimorfismo.Employee;
import entitiesPolimorfismo.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Employee #" + i + " data:");
            sc.nextLine();
            System.out.print("Outsourced (y/n)? ");
            char isOutSourced = sc.next().charAt(0);
            if(isOutSourced == 'n'){
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                Employee emp = new Employee(name, hours, valuePerHour);
                employees.add(emp);
            } else {
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                employees.add(emp);
            }
        }

        System.out.println("PAYMENTS: ");
        for (Employee e: employees){
            System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
        }





        sc.close();
    }
}
