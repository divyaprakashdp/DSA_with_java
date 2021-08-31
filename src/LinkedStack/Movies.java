package LinkedStack;

public class Movies {
    private String movieName;
    private String genre;
    private int length;

    public Movies(String movieName, String genre, int length) {
        this.movieName = movieName;
        this.genre = genre;
        this.length = length;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "movieName='" + movieName + '\'' +
                ", genre='" + genre + '\'' +
                ", length=" + length +
                '}';
    }
}
