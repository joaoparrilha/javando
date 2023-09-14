package applicationVetores;

import entities.Employee;
import entitiesVetores.EmpList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExLista {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <EmpList> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.printf("Employee #%d: %n", i + 1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)){
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            EmpList emp = new EmpList(id, name, salary);

            list.add(emp);

        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();

        EmpList emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        if (emp == null){
            System.out.println("This id does not exist! ");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for(EmpList e: list){
            System.out.println(e);
        }


        sc.close();
    }

    public static Integer position(List<EmpList> list, int id){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }

        }
        return null;
    }

    public static boolean hasId(List<EmpList> list, int id){
        EmpList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
