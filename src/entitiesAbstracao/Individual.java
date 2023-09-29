package entitiesAbstracao;

public class Individual extends Person{

    private Double healthExpenditures;

    public Individual(){
        super();
    }

    public Individual(String name, Double income){
        super(name, income);
    }

    public Individual(String name, Double income, Double healthExpenditures){
        super(name, income);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double taxes() {
        double totalTaxes = 0.0;
        if(getIncome() < 20000.00){
            totalTaxes = getIncome() * 0.15;
        } else {
            totalTaxes = getIncome() * 0.25;
        }
        if(healthExpenditures > 0){
            totalTaxes -= healthExpenditures * 0.5;
        }
        return totalTaxes;
    }


}
