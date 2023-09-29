package applicationAbstracao;

import entitiesAbstracao.Circle;
import entitiesAbstracao.Color;
import entitiesAbstracao.Rectangle;
import entitiesAbstracao.Shape;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramResolvido {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape> shapes = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char shapeType = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (shapeType == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shapes.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shapes.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape s : shapes){
            System.out.printf("%.2f%n", s.area());
        }


        sc.close();
    }
}
