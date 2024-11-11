import java.util.HashMap;

public class AccountManager {
    private HashMap<String, String> accounts; 

    public AccountManager() {
        accounts = new HashMap<>();
    }

   
    public boolean registerAccount(String username, String password) {
        if (accounts.containsKey(username)) {
            System.out.println("Username already exists. Please choose a different username.");
            return false;
        } else {
            accounts.put(username, password);
            System.out.println("Account created successfully!");
            return true;
        }
    }

    public boolean login(String username, String password) {
        if (accounts.containsKey(username) && accounts.get(username).equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }
}

