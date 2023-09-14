package application;

import entities.Rectangle;

import java.util.Scanner;

public class EXoo01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle ret1 = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        ret1.width = sc.nextDouble();
        ret1.height = sc.nextDouble();

        System.out.println("AREA = " + ret1.area());
        System.out.println("PERIMETER = " + ret1.perimeter());
        System.out.println("DIAGONAL = " + ret1.diagonal());

        sc.close();
    }
}
