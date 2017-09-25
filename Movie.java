/**
 * Movie Object Class file
 * @author (Atticus Zambrana)
 * @version (9/15/17)
 */
public class Movie {
    
    private int MOVIE_RATING;
    private String MOVIE_TITLE;
    private int PRICE;
    
    public Movie(String M) {
        MOVIE_TITLE = M;
    }
    
    public String getTitle() {
        return MOVIE_TITLE;
    }
    public int getRating() {
        return MOVIE_RATING;
    }
    public void setTitle(String t) {
        MOVIE_TITLE = t;
    }
    public void setRating(int r) {
        MOVIE_RATING = r;
    }
    public void setPrice(int p) {
        PRICE = p;
    }
    public int getPrice() {
        return PRICE;
    }
}