package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        // chamando construtor
        Product product = new Product(name, price, quantity);

        // Utilizando get e set (Encapsulamento)
        product.setName("Computer");
        System.out.println("Update name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Update price: " + product.getPrice());

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantityAdd = sc.nextInt();
        product.addProducts(quantityAdd);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);


        sc.close();
    }
}