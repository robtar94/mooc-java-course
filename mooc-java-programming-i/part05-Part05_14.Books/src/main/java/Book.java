
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compared) {
        // checking if object are in the same place of memory.
        if (this == compared) {
            return true;
        }
        // checking if objects are of the same type.
        if (!(compared instanceof Book)) {
            return false;
        }
        // checking if the values of the object are correct.

        Book comparedBook = (Book) compared;
        if (comparedBook.name.equals(this.name)
                && comparedBook.publicationYear == this.publicationYear) {
            return true;
        }
        return false;
    }

}
