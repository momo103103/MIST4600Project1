import java.util.Scanner;

public class LoginManager {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountManager accountManager = new AccountManager(); 
        boolean done = true;

        System.out.println("Welcome to Java Project Bank Account");

        while (done) {
            System.out.println("What would you like to do today?");
            System.out.println("1: Create an account");
            System.out.println("2: Log into your account");
            System.out.println("3: Exit the program");
            System.out.print("Please enter your choice (1-3): ");
            int option = input.nextInt();
            input.nextLine(); 

            switch (option) {
                case 1:
                    System.out.print("Enter username for new account: ");
                    String newUsername = input.nextLine();
                    System.out.print("Enter password for new account: ");
                    String newPassword = input.nextLine();
                    accountManager.registerAccount(newUsername, newPassword);
                    break;

                case 2:
                    System.out.print("Enter username: ");
                    String username = input.nextLine();
                    System.out.print("Enter password: ");
                    String password = input.nextLine();
                    accountManager.login(username, password);
                    break;

                case 3:
                    System.out.println("Exiting the program...");
                    done = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }


        System.out.println("Thank you for using Java Project Bank Account!");
    }
}
