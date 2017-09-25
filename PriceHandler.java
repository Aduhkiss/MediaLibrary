public class PriceHandler {
    public PriceHandler() {
        
    }
    public int getSongPrice(Song song) {
        return song.getPrice();
    }
    public int getMoviePrice(Movie movie) {
        return movie.getPrice();
    }
    public int getBookPrice(Book book) {
        return book.getPrice();
    }
    public void setSongPrice(Song song, int pri) {
        song.setPrice(pri);
    }
    public void setMoviePrice(Movie movie, int pri) {
        movie.setPrice(pri);
    }
    public void setBookPrice(Book book, int pri) {
        book.setPrice(pri);
    }
}