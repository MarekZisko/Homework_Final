package BookPcg;

public class ForeignBook extends Book {

    public ForeignBook(String bookName, String authorName, int numOfPages, String language) {
        super(bookName, authorName, numOfPages);
        this.language = language;
    }

    public ForeignBook(String bookName, String authorName, int numOfPages) {
        super(bookName, authorName, numOfPages);
        this.language = "English";
    }

    private String language;

    @Override
    public String toString() {
        return ("Book title: " + getBookName() + " Author: " + getAuthorName() + " Number of pages: " + getNumOfPages() + " Language: " + language);
    }
}
