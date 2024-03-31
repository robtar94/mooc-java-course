
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here

        Counter counter = new Counter(7);

        counter.decrease(-2);
        System.out.println(counter.value());


    }
}
