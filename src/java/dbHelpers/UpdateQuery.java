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
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Movie;

/**
 *
 * @author ninani
 */
public class UpdateQuery {
  private Connection conn;
public UpdateQuery(){
    try {
            Properties props = new Properties();
            InputStream instr = getClass().getResourceAsStream("dbConn.properties");
           
            props.load(instr);
            instr.close();
           
            String driver = props.getProperty("driver.name");
            String url = props.getProperty("server.name");
            String username = props.getProperty("user.name");
            String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        } catch (IOException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
public void doUpdate(Movie movie) throws SQLException{
    String query= "UPDATE Movie set moviename=?, yearreleased=?, genre=?, producer=? WHERE movieid=?";
PreparedStatement ps = conn.prepareStatement(query);
     
          ps.setString(1, movie.getMoviename());
          ps.setInt(2, movie.getYearreleased());
ps.setString(3,movie.getGenre());
ps.setString(4, movie.getProducer());
ps.setInt(5, movie.getMovieid());

ps.executeUpdate();

        }  
}
