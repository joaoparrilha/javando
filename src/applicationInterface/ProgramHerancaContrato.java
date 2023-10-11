package applicationInterface;

import modelInterface.entitiesHerancaContrato.AbstractShape;
import modelInterface.entitiesHerancaContrato.Circle;
import modelInterface.entitiesHerancaContrato.Color;
import modelInterface.entitiesHerancaContrato.Rectangle;

public class ProgramHerancaContrato {
    public static void main(String[] args) {

        AbstractShape f1 = new Circle(Color.BLACK, 2.0);
        AbstractShape f2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + f1.getColor());
        System.out.println("Circle area: " + String.format("%.2f", f1.area()));
        System.out.println("Rectangle color: " + f2.getColor());
        System.out.println("Rectangle area: " + String.format("%.2f", f2.area()));


    }
}
