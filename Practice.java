import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = "admin";
        String pass = "12345";

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if (username.equals(user) && password.equals(pass)) {
            System.out.println("Login successful!");
        }else{
            System.out.println("Invalid credentials!");
        }
    }
}