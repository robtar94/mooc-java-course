
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (true) {
            String input = scanner.nextLine();

            count++;

            if(input.equals("end")) {
                count--;
                break;
            }
        }
        System.out.println(count);

    }
}
