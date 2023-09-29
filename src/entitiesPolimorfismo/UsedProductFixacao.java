package entitiesPolimorfismo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProductFixacao extends ProductFixacao{

    private LocalDate manufactureDate;

    public UsedProductFixacao(){}

    public UsedProductFixacao(String name, Double price, LocalDate manufacture){
        super(name, price);
        this.manufactureDate = manufacture;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return getName() +
                " (used) $ " +
                String.format("%.2f", getPrice()) +
                " (Manufacture date: " +
                manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+
                ")";
    }
}
