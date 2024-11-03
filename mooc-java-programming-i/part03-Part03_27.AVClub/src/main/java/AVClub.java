
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;
            } else {
                if (text.contains("av")) {
                    String[] parts = text.split(" ");
                    for (String part : parts) {
                        System.out.println(part);
                    }
                }
            }
        } 


    }
}
