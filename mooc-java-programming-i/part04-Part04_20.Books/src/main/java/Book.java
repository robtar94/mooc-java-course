public class Book {

    private String title;
    private int numberOfPages;
    private int yearOfPublication;

    public Book (String titleOfBook, int pages, int year) {

        this.title = titleOfBook;
        this.numberOfPages = pages;
        this.yearOfPublication = year;
    }

    public String getTitle () {
        return title;
    }

    public int getNumberOfPages () {
        return numberOfPages;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String toString () {
        return title + ", " + numberOfPages + " " + "pages" + ", " + yearOfPublication;
    }
    
}
