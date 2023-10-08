public class ArrayPrinter {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int lastElement = array.length - 1;
            System.out.print(array[i]);
            if (i < lastElement) {
                System.out.print(", ");
            }
        }
        
    }
}
