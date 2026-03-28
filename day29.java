import java.util.Scanner;

class Bank {
    private double balance;

    Bank(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank acc = new Bank(5000);

        while (true) {
            System.out.println("\n1.Deposit  2.Withdraw  3.Check Balance  4.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> { System.out.print("Enter amount: "); acc.deposit(sc.nextDouble()); }
                case 2 -> { System.out.print("Enter amount: "); acc.withdraw(sc.nextDouble()); }
                case 3 -> acc.checkBalance();
                case 4 -> { System.out.println("Goodbye!"); return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
