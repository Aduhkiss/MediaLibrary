
/**
 * Write a description of class Song here.
 * 
 * @author (Atticus Zambrana) 
 * @version (9/14/17)
 */
public class Song
{
    // instance field variables - replace the example below with your own
    private int SONG_RATING;
    private String SONG_TITLE;
    private boolean favorite;
    private int PRICE;

    /**
     * Constructor for objects of class Song
     */
    public Song(String songTitle)
    {
        // initialise instance variables
        SONG_TITLE = songTitle;
    }
    
    // Methods for my field values
    public String getTitle() {
        return SONG_TITLE;
    }
    public int getRating() {
        return SONG_RATING;
    }
    public void setTitle(String t) {
        SONG_TITLE = t;
    }
    public void setRating(int r) {
        SONG_RATING = r;
    }
    public void setFavorite(boolean a) {
        favorite = a;
    }
    public String isFavorite() {
        if(favorite == true) {
            return "Favorite";
        }
        else {
            return "Not Favorite";
        }
    }
        public void setPrice(int p) {
        PRICE = p;
    }
    public int getPrice() {
        return PRICE;
    }
}
