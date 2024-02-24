
public class Book {
    private String author;
    private String title;
    private int pageCount;

    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pageCount = pages;
    }

    public String getAuthor() {
    return author;
    }


public String getName() {
    return title;
}
public int getPages() {
return pageCount;
}

public String toString() {
    return author + ", " + title +", " + pageCount + " pages";
}

}
