
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String identifier = "";
        String name = "";
        ArrayList<Archive> items = new ArrayList<>();

        while (true) {

            System.out.println("Identifier? (empty will stop)");

            identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Archive archiveItem = new Archive(identifier, name);
            if (items.contains(archiveItem)) {

            } else {
                items.add(archiveItem);
            }

        }

        for (Archive item : items) {
            System.out.println(item.getIdentifier() + ": " + item.getName());
        }

    }
}
