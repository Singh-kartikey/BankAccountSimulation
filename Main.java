// No package needed
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Show Transactions\n4. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    account.deposit(scanner.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    account.withdraw(scanner.nextDouble());
                    break;
                case 3:
                    account.printTransactions();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}