package applicationPolimorfismo;

import entitiesPolimorfismo.ImportedProductFixacao;
import entitiesPolimorfismo.ProductFixacao;
import entitiesPolimorfismo.UsedProductFixacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramFixacao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List <ProductFixacao> products = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char typeProduct = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (typeProduct == 'i'){
                System.out.print("Customs fee: ");
                double customFee = sc.nextDouble();
                ProductFixacao prod = new ImportedProductFixacao(name, price, customFee);
                products.add(prod);
            } else if (typeProduct == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                ProductFixacao prod = new UsedProductFixacao(name, price, manufactureDate);
                products.add(prod);
            } else {
                ProductFixacao prod = new ProductFixacao(name, price);
                products.add(prod);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (ProductFixacao p : products){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
