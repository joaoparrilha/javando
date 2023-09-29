package entitiesAbstracao;

public class Company extends Person{

    private Integer employeeNumber;

    public Company(){
        super();
    }

    public Company (String name, Double income, Integer employeeNumber){
        super(name, income);
        this.employeeNumber = employeeNumber;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public double taxes(){
        double totalTaxes = 0.0;
        if (employeeNumber > 10){
            totalTaxes = getIncome() * 0.14;
        } else {
            totalTaxes = getIncome() * 0.16;
        }
        return totalTaxes;
    }

}
