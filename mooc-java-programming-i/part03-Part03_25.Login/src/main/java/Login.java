
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String login = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (login.equals("alex") || login.equals("emma")) {
            if (password.equals("sunshine") || password.equals("haskell")) {
                System.out.println("You have successfully logged in!");

            }
        } else {
            System.out.println("Incorrect username or password!");
        }


    }
}
