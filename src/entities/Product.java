package entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    // Construtor
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Sobrecarga de construtor, o que diferencia é os parametros
    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Declarar construtor padrão, para iniciar sem valores
    public Product(){
        
    }

    // Encapsulamento GET e SET

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    //nao tem set, pois temos 2 metodos para alteração, protegendo a variavel
    /* public void setQuantity(int quantity) {
        this.quantity = quantity;
    } */

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;

    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }

}