import java.util.Scanner;
public class ATMSimulation {
    private static double balance = 0.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4:
                    System.out.println("Exiting... Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                    break;
            }            
        } while (choice != 4);        
        scanner.close();
    }
    public static void checkBalance() {
        System.out.printf("Your current balance is: $%.2f\n", balance);
    }
    public static void depositMoney(Scanner scanner) {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.printf("You have successfully deposited $%.2f\n", amount);
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }
    public static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.printf("You have successfully withdrawn $%.2f\n", amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }
}
