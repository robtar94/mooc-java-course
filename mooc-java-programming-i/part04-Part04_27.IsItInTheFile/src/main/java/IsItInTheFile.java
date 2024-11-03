
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList list = new ArrayList<>();

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        System.out.println("Search for:");
        String searchFor = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                list.add(line);
            }
            if (list.contains(searchFor)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found!");
            }
            } catch (Exception e) {
                System.out.println("Reading the file " + fileName + "failed.");
            }
        
        




    }
}
