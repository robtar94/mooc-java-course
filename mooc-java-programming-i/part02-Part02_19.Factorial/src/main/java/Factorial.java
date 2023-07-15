
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int factorial = 1;
        int n = 1;

        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());

        if (number == 1) {
            factorial = 1;
        } else {

            while (n <= number) {
                factorial = factorial * n;
                n++;

            }
        }

        System.out.println("Factorial: " + factorial);

    }
}
