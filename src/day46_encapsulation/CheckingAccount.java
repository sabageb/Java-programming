package day46_encapsulation;
//balance, accountNumber, accountHolder, type="checking

public class CheckingAccount {
    private double balance;
    private long accountNumber;
    private String accountHolder;
    public String type = "checking";// default is checking, we can change if needed using setter

//shortcut to generate getter &setter> right click > generate Getter and Setter > Select all> Ok.
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void setType(String type) {
        this.type = type;




    }
}




