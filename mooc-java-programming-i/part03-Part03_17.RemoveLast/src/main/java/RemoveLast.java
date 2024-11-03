
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        System.out.println("Before: " + strings);
        removeLast(strings);
        System.out.println("After " + strings);

    }

    public static void removeLast(ArrayList<String> strings) {
        if(strings.isEmpty()) {
            System.out.println(strings);
        } else {
            strings.remove(strings.size()-1);
        }
    }

}
