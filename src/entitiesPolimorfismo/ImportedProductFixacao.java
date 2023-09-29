package entitiesPolimorfismo;

public class ImportedProductFixacao extends ProductFixacao {

    private Double customsFee;

    public ImportedProductFixacao(){}

    public ImportedProductFixacao(String name, Double price, Double customFee){
        super(name, price);
        this.customsFee = customFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return super.getPrice() + customsFee;
    }

    @Override
    public String priceTag(){
        return getName() + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
    }

}
