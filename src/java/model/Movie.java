package model;

public class Movie {
private int movieid;
private String moviename;
private int yearreleased;
private String genre;
private String producer; 

    public Movie() {
        this.movieid = 0;
        this.moviename = "";
        this.yearreleased = 0;
        this.genre = "";
        this.producer = "";
    }
public Movie(int movieid, String moviename, int yearreleased, String genre, String producer) {
        this.movieid = movieid;
        this.moviename = moviename;
        this.yearreleased = yearreleased;
        this.genre = genre;
        this.producer = producer;
    }

    public int getMovieid() {
        return movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public int getYearreleased() {
        return yearreleased;
    }

    public void setYearreleased(int yearreleased) {
        this.yearreleased = yearreleased;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Movie{" + "movieid=" + movieid + ", moviename=" + moviename + ", yearreleased=" + yearreleased + ", genre=" + genre + ", producer=" + producer + '}';
    }

}
