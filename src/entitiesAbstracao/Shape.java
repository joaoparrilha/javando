package entitiesAbstracao;

// Classe abstrata, a qual não pode ser instanciada
public abstract class Shape {

    private Color color;

    public Shape(){}

    public Shape(Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Método abstrato
    public abstract double area();
}
