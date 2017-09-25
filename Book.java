/**
 * Movie Object Class file
 * @author (Atticus Zambrana)
 * @version (9/15/17)
 */
public class Book {
    
    private int BOOK_RATING;
    private String BOOK_TITLE;
    private int PRICE;
    
    public Book(String title) {
        BOOK_TITLE = title;
    }
    
    public String getTitle() {
        return BOOK_TITLE;
    }
    public int getRating() {
        return BOOK_RATING;
    }
    public void setTitle(String t) {
        BOOK_TITLE = t;
    }
    public void setRating(int r) {
        BOOK_RATING = r;
    }
        public void setPrice(int p) {
        PRICE = p;
    }
    public int getPrice() {
        return PRICE;
    }
}