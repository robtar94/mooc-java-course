
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());

        double result = Math.pow(number, 2); // aternatively number * number;

        System.out.println((int) result);


    }
}
