package BookPcg;

public class Book {
    public Book(String bookName, String authorName, int numOfPages) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.numOfPages = numOfPages;
    }

    private String bookName;
    private String authorName;
    private int numOfPages;

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    @Override
    public String toString() {
        return ("Book title: " + bookName + " Author: " + authorName + " Number of pages: " + numOfPages);
    }
}
