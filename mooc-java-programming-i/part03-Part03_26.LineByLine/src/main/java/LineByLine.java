
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            } else {

                String[] pieces = input.split(" "); // splitting by the space "" - spliting by every character
                for (String piece : pieces) {
                    System.out.println(piece);
                }
            }
        }


    }
}
