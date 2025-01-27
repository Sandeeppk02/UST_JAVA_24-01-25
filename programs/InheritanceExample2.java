class BankAccount {
    String accountNumber;

    BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    void deposit(double amount) {
        System.out.println("Deposited: Rs :" + amount);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    void calculateInterest() {
        System.out.println("Calculating interest for Savings Account: " + accountNumber);
    }
}

public class InheritanceExample2 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("123456");
        sa.deposit(1000);
        sa.calculateInterest();
    }
}
