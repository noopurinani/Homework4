/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Movie;

/**
 *
 * @author ninani
 */
public class ReadRecord {
    
    private Connection conn;
    private ResultSet results;
    private Movie movie=new Movie();
    private int movieid;
public ReadRecord (int movieid){
try {
            Properties props = new Properties();
    try (InputStream instr = getClass().getResourceAsStream("dbConn.properties")) {
        props.load(instr);
    }
           
            String driver = props.getProperty("driver.name");
            String url = props.getProperty("server.name");
            String username = props.getProperty("user.name");
            String passwd = props.getProperty("user.password");
    this.movieid=movieid; 
            try {
        Class.forName(driver);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
    }
           
    try {
        conn = DriverManager.getConnection(url, username, passwd);
    } catch (SQLException ex) {
        Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
    }
           
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
   
    public void doRead(){
       
        try {
            String query = "SELECT * FROM Movie WHERE movieid=?";
           
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, movieid);
            this.results=ps.executeQuery();
            this.results.next();
            movie.setMovieid(this.results.getInt("movieid"));
            movie.setMoviename(this.results.getString("moviename"));
            movie.setYearreleased(this.results.getInt("yearreleased"));
           movie.setGenre(this.results.getString("genre"));
       movie.setProducer(this.results.getString("producer"));
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
public Movie getMovie(){
        return this.movie;
        }
}
