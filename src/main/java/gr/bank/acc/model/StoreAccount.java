package gr.bank.acc.model;

public class
StoreAccount extends Account {
    protected String storeName;
    protected Category accountCategory;

    public StoreAccount() {
    }

    public StoreAccount(String owner, Double balance, int numberOfTransactions, String storeName, Category accountCategory) {
        super(owner, balance, numberOfTransactions);
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Category getAccountCategory() {
        return accountCategory;
    }

    public void setAccountCategory(Category accountCategory) {
        this.accountCategory = accountCategory;
    }

    public StoreAccount(String owner, Double balance, int numberOfTransactions) {
        super(owner, balance, numberOfTransactions);
    }

    public void changeCategory(Category category){
        this.setAccountCategory(category);
    }

    @Override
    public String toString() {
        return "StoreAccount{" +
                "storeName='" + storeName + '\'' +
                ", accountCategory='" + accountCategory + '\'' +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                ", numberOfTransactions=" + numberOfTransactions +
                '}';
    }

    public void withdraw(double withdrawAmount, Category category, String store) {
        if (category==this.accountCategory){
        super.withdraw(withdrawAmount);

        this.storeName=store;
        }
    }

    public void deposit(double depositAmount,Category category,String store) {
        if (category==this.accountCategory){
        super.deposit(depositAmount);
        this.storeName=store;}
    }
}
