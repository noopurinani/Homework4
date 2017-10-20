package model;

public class Movie {
private int Movieid;
private String Moviename;
private int Yearreleased;
private String Genre;
private String Producer; 

    public Movie() {
        this.Movieid = 0;
        this.Moviename = "";
        this.Yearreleased = 0;
        this.Genre = "";
        this.Producer = "";
    }
public Movie(int Movieid, String Moviename, int Yearreleased, String Genre, String Producer) {
        this.Movieid = Movieid;
        this.Moviename = Moviename;
        this.Yearreleased = Yearreleased;
        this.Genre = Genre;
        this.Producer = Producer;
    }

    public int getMovieid() {
        return Movieid;
    }

    public void setMovieid(int Movieid) {
        this.Movieid = Movieid;
    }

    public String getMoviename() {
        return Moviename;
    }

    public void setMoviename(String Moviename) {
        this.Moviename = Moviename;
    }

    public int getYearreleased() {
        return Yearreleased;
    }

    public void setYearreleased(int Yearreleased) {
        this.Yearreleased = Yearreleased;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getProducer() {
        return Producer;
    }

    public void setProducer(String Producer) {
        this.Producer = Producer;
    }

    

    @Override
    public String toString() {
        return "Movie{" + "movieid=" + Movieid + ", moviename=" + Moviename + ", yearreleased=" + Yearreleased + ", genre=" + Genre + ", producer=" + Producer + '}';
    }

    public void setmovieid(int movieid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setYearReleased(int yearreleased) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
