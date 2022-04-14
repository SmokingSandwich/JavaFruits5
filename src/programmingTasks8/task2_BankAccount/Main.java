package programmingTasks8.task2_BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount bank = new BankAccount();
        System.out.println(bank.getBalance());

        BankAccount newBank = new BankAccount(bank, 2000);

        System.out.println(newBank.getBalance());

    }
}
