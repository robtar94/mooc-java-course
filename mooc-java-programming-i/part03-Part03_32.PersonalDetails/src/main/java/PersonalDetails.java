
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int count = 0;
        int maxAge = 0;
        double avgYearOfBirth = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String parts[] = input.split(",");

            String name = parts[0];

            if (longestName.length() < name.length()) {

                longestName = name;
            }

            int age = Integer.valueOf(parts[1]);

             maxAge+=age;
             count+=1;

             avgYearOfBirth = (double) maxAge/count;
        }
         System.out.println("Longest name: " + longestName);
        System.out.println("Avearge of the birth years: " + avgYearOfBirth);


    }
}
