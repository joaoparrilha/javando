package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class EXoo03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = sc.nextLine();
        s1.n1 = sc.nextDouble();
        s1.n2 = sc.nextDouble();
        s1.n3 = sc.nextDouble();

        s1.aprove();



        sc.close();
    }
}
