
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first, last = 0;
        int sum = 0;

        System.out.print("First number? ");
        first = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        last = Integer.valueOf(scanner.nextLine());

        while (first <= last) {
            sum += first;
            first += 1;
        }

        System.out.println("The sum is " + sum);

    }
}
