public class MediaRegistry {
    public MediaRegistry() {
        
    }
    public void registerMedia() {
        registerSongs();
        registerMovies();
        registerBooks();
    }
    public void registerSongs() {
        Song song1 = new Song("Get Rekt");
        Song song2 = new Song("lol i died");
    }
    public void registerMovies() {
        Movie movie1 = new Movie("Titanic");
    }
    public void registerBooks() {
        Book book1 = new Book("To Kill a Mocking Bird");
    }
}