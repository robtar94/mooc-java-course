
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        final String printOutput = "The collection " + this.name + " ";

        if (elements.isEmpty()) {

            return printOutput + "is empty.";
        }

        if (elements.size() == 1) {

            return printOutput + "has " + elements.size() + " element:" + printElements();

        } else {

            return printOutput + "has " + elements.size() + " elements:" + printElements();

        }
    }

    private String printElements() {
        final StringBuilder finalPrintOutput = new StringBuilder();
        for (String element : elements) {
            finalPrintOutput.append("\n").append(element);
        }
        return finalPrintOutput.toString();
    }

}
