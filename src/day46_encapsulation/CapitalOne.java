package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc1 = new CheckingAccount();
        acc1.setAccountNumber(355525588555L);
        acc1.setBalance(250.0);
        acc1.setAccountHolder("Mike Smith");
        acc1.setType("360 checking");


        System.out.print("acc1 = " + acc1);

        /**
         * public void setAccountInfo(long accountNumber, String accountHolder, double balance, String type
         * 1) this.accountNumber = accountNumber;
         * 2)setAccountNumber(accountNumber)
         */
    }
}
