import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>(); // list of type book made from Book class.
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if(title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            int yearOfPublication = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, yearOfPublication));
        }

        System.out.print("What information will be printed? ");
        String printInfo = scanner.nextLine();

        if (printInfo.equals("everything")) {
            
            for (Book book : books) {

                System.out.println(book.toString());
            }

            } else if (printInfo.equals("name")) {

                for (Book book : books) {

                    System.out.println(book.getTitle());
                }

            } else if (printInfo.equals("pages")) {

                for (Book book : books) {

                    System.out.println(book.getNumberOfPages());
                }

            } else if (printInfo.equals("yearOfPublication")) {

                for (Book book : books) {
                    System.out.println(book.getYearOfPublication());
                }
            }
    }
}
