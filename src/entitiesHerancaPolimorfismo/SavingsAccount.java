package entitiesHerancaPolimorfismo;

// final nao deixa a classe ser herdada por outra classe
// final nao deixa o metodo ser sobreescrito em outra classe
// public final class SavingsAccount...
public class SavingsAccount extends Account{

    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate){
        super(number, holder, balance);
        this.interestRate = interestRate;
    }
    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override
    public void withDraw(double amount) {
        balance -= amount;
    }
}

