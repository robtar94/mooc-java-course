
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Last Number? ");
        int number = Integer.valueOf(scanner.nextLine());

        int i = 0;
        while (i < number) {
            i += 1;
            sum += i;

        }
        System.out.println("The sum is " + sum);

    }
}
