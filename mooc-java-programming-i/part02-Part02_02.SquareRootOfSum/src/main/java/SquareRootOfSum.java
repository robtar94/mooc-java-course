
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declaring variables

        int firstNumber = Integer.valueOf(scanner.nextLine());
        int secondNumber = Integer.valueOf(scanner.nextLine());

        //calculations

        int sum = firstNumber + secondNumber;

        double squareRootOfSum = Math.sqrt(sum);

        //printing result

        System.out.println((int) squareRootOfSum);

    }
}
