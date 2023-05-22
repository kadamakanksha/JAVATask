import java.util.Scanner;

public class ATM {
    private static final String[] USER_IDS = {"1234", "5678", "9012"};
    private static final String[] USER_PINS = {"4321", "8765", "2109"};
    private static final String[] USER_NAMES = {"Akanksha", "Sumit", "Aditya"};
    private static final int[] USER_BALANCES = {7300, 5600, 3900};
    
    private Scanner scanner;
    private int currentUserIndex;

    public ATM() {
        scanner = new Scanner(System.in);
        
        currentUserIndex = -1;
    }

    public void run() {
        System.out.println("Welcome to the ATM!");

        while (true) {
            if (currentUserIndex == -1) {
                if (!login()) {
                    System.out.println("Invalid ID or PIN. Please try again.");
                    continue;
                }
            }

            displayMenu();

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayTransactionHistory();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    transfer(currentUserIndex);
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private boolean login() {
        System.out.print("Enter your ID: ");
        String id = scanner.next();

        System.out.print("Enter your PIN: ");
        String pin = scanner.next();

        for (int i = 0; i < USER_IDS.length; i++) {
            if (id.equals(USER_IDS[i]) && pin.equals(USER_PINS[i])) {
                currentUserIndex = i;
                System.out.println("Welcome, " + USER_NAMES[i] + "!");
                return true;
            }
        }

        return false;
    }

    private void displayMenu() {
        System.out.println("What would you like to do?");
        System.out.println("1. View transaction history");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Quit");
    }

    private void displayTransactionHistory() {
        System.out.println("Transaction history for " + USER_NAMES[currentUserIndex] + ":");
       
       
        // TODO: Implement transaction history
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        int amount = scanner.nextInt();

        if (amount > USER_BALANCES[currentUserIndex]) {
            System.out.println("Insufficient balance. Please try again.");
            return;
        }

        USER_BALANCES[currentUserIndex] -= amount;
        System.out.println("Withdrawal successful. Current balance: " + USER_BALANCES[currentUserIndex]);
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        int amount = scanner.nextInt();

        

        
        
        System.out.println("Deposit successful. Current balance: " + USER_BALANCES[currentUserIndex]);
    }

    private void transfer(int currentUserIndex) {
        System.out.print("Enter recipient's ID: ");
        String recipientId = scanner.next();

        int recipientIndex = -1;
        for (int i = 0; i < USER_IDS.length; i++) {
            if (recipientId.equals(USER_IDS[i])) {
                recipientIndex = i;
                break;
            }
        }

        if (recipientIndex == -1) {
            System.out.println("Recipient ID not found. Please try again.");
            return;
        }

        System.out.print("Enter amount to transfer: ");
        int amount = scanner.nextInt();

        if (amount > USER_BALANCES[currentUserIndex]) {
            System.out.println("Insufficient balance. Please try again.");
            return;
        }

        USER_BALANCES[currentUserIndex] -= amount;
        USER_BALANCES[recipientIndex] += amount;
        System.out.println("Transfer successful. Current balance: " + USER_BALANCES[currentUserIndex]);
    }

   public static void main(String[] args)
 {
ATM atm = new ATM();
atm.run();
}
}
