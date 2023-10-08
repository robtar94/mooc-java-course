
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.

        int sum = 0;
        double avg = 0;
        int count = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            } 
               list.add(input);
               count++;
               sum +=input;

               avg =  (double) sum/count;
        }
        

        System.out.println("Average: " + avg);
        
    }
}
