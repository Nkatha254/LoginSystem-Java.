import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined credentials
        String correctUsername = "admin";
        String correctPassword = "12345";

        int attempts = 3; // user has 3 tries

        while (attempts > 0) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = "";

            // Read password character by character and print * instead
            for (int i = 0; i < correctPassword.length(); i++) {
                char ch = scanner.next().charAt(0);
                password += ch;
                System.out.print("*"); // Masking password
            }
            scanner.nextLine(); // consume extra line

            // Check credentials
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("\n✅ Login successful! Welcome " + username + "!");
                break;
            } else {
                attempts--;
                System.out.println("\n❌ Incorrect username or password.");
                if (attempts > 0) {
                    System.out.println("You have " + attempts + " attempt(s) left.");
                } else {
                    System.out.println("⚠️ You have used all attempts. Access Denied!");
                }
            }
        }

        scanner.close();
    }
}
