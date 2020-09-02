package gr.bank.acc.model;

public class Account {
    protected String owner;
    protected Double balance;
    protected int numberOfTransactions;

    public Account() {
    }

    public Account(String owner, Double balance, int numberOfTransactions) {
        this.owner = owner;
        this.balance = balance;
        this.numberOfTransactions = numberOfTransactions;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                ", numberOfTransactions=" + numberOfTransactions +
                '}';
    }

    public void withdraw(double withdrawAmount){
        if(this.balance>= withdrawAmount) {
            this.balance = this.balance - withdrawAmount;
            this.numberOfTransactions++;
        }
    }

    public void deposit(double depositAmount){
        this.balance = this.balance + depositAmount;
        this.numberOfTransactions++;

    }

}
