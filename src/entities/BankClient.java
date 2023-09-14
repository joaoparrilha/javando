package entities;

public class BankClient {
    private int accountNumber;
    private String name;
    private double money;

    public BankClient(int accountNumber, String name, double initialDeposit){
        this.accountNumber = accountNumber;
        this.name = name;
        deposite(initialDeposit);
    }

    public BankClient(int accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposite(double value){
        money += value;
    }

    public void withDraw(double value){
        money -= value + 5.0;
    }

    @Override
    public String toString() {
        return "Account " +
                accountNumber +
                ", Holder: " +
                name +
                ", Balance: $ " +
                String.format("%.2f", money);
    }
}
