package BookPcg;

public class ScientificBook extends Book {


    public ScientificBook(String bookName, String authorName, int numOfPages, String scientificArea) {
        super(bookName, authorName, numOfPages);
        this.scientificArea = scientificArea;
    }

    private String scientificArea;

    @Override
    public String toString() {
        return ("Book title: " + getBookName() + " Author: " + getAuthorName() + " Number of pages: " + getNumOfPages() + " Scientific area: " + scientificArea);
    }
}
