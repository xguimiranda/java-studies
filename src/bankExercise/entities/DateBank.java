package bankExercise.entities;

public class DateBank {
    private final int accountNumber;
    private String holder;
    private double balance;
    final int TAX = 5;

    public String toString() {
        return "Account "+ getAccountNumber() + ", Holder: "+ getHolder() + ", balance: $"+ String.format("%.2f", balance);
    }

    public DateBank(int accountNumber, String holder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        depositBalance(initialDeposit);
    }

    public DateBank(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setHolder(String holder){
        this.holder = holder;
    }

    public String getHolder(){
        return holder;
    }

    public double getBalance(){
        return balance;
    }

    public void depositBalance(double deposit){
        balance += deposit;
    }

    public void withdrawBalance(double withdraw){
        balance -= (withdraw + TAX);
    }

}
