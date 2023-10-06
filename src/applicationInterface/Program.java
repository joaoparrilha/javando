package applicationInterface;

import modelInterface.entities.CarRental;
import modelInterface.entities.Vehicle;
import modelInterface.services.BrazilTaxService;
import modelInterface.services.RentalService;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
        CarRental car = new CarRental(start, finish, new Vehicle(carModel));

        BrazilTaxService taxService = new BrazilTaxService();
        System.out.println(taxService.tax(50));

        System.out.println("Entre o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(car);

        System.out.println("FATURA: ");
        System.out.print("Pagamento básico: " + car.getInvoice().getBasicPayment() + "\n");
        System.out.print("Imposto: " + car.getInvoice().getTax() + "\n");
        System.out.print("Pagamento total: " + car.getInvoice().totalPayment() + "\n");


        sc.close();
    }
}
