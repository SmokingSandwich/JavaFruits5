package programmingTasks8.task2_BankAccount;

public class BankAccount {
    private double balance;      // Stan konta.


    public BankAccount() {
        balance = 500;
    }

    public BankAccount(double startBalance) {
        balance = startBalance;
    }

    public BankAccount(String str) {
        balance = Double.parseDouble(str);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void deposit(String str) {
        balance += Double.parseDouble(str);
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void withdraw(String str) {
        balance -= Double.parseDouble(str);
    }

    public void setBalance(double b) {
        balance = b;
    }

    public void setBalance(String str) {
        balance = Double.parseDouble(str);
    }


    public double getBalance() {
        return balance;
    }

    BankAccount(BankAccount object, double balance) {
        this.balance = object.balance;
        this.balance += 2000;
    }
}
