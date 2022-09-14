package Book;

public class ScientificBook extends StandardBook {


    public ScientificBook(String bookName, String authorName, int numOfPages, String scientificArea) {
        super(bookName, authorName, numOfPages);
        this.scientificArea = scientificArea;
    }
    private String scientificArea;
}
