
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

public class SearchQuery {
private Connection conn; 
private ResultSet results;
public SearchQuery() throws SQLException{
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
             Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
         }
           
            conn = DriverManager.getConnection(url, username, passwd);
           
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
}
 public void doSearch(String moviename) throws SQLException{
 
     String query= "SELECT * FROM Movie WHERE Upper(Moviename) LIKE ? ORDER By movieid";
     PreparedStatement ps = conn.prepareStatement(query);
     ps.setString(1, "%" + moviename.toUpperCase() + "%");
     this.results = ps.executeQuery();
 }
public String getHTMLtable(){
    String table="";
    table+= "<table border=1>";
    table+= "<tr>";
    table+="<th>Movie ID</th>";
    table+="<th>Movie Name</th>";
    table+="<th>Year Released</th>";
    table+="<th>Genre</th>";
    table+="<th>Producer</th>";
    table+="<th>Update or Delete</th>";
    table+="</tr>";
    try {
        while(this.results.next()){
            Movie movie=new Movie();
            movie.setMovieid(this.results.getInt("movieId"));
            movie.setMoviename(this.results.getString("moviename"));
            movie.setYearreleased(this.results.getInt("yearreleased"));
            movie.setGenre(this.results.getString("genre"));
            movie.setProducer(this.results.getString("producer")); 
            
        table += "<tr>";
            table+="<td>";
                   table+= movie.getMovieid(); 
                    table+="</td>";
                    table+="<td>";
                   table+= movie.getMoviename(); 
                    table+="</td>";table+="<td>";
                   table+= movie.getYearreleased(); 
                    table+="</td>";table+="<td>";
                   table+= movie.getGenre(); 
                    table+="</td>";table+="<td>";
                   table+= movie.getProducer(); 
                    table+="</td>";
                    table+= "<td>";
                    table += "<href=update?movieid=" + movie.getMovieid() + "> Update</a>" + "<a href=delete?movieid=" + movie.getMovieid() + ">Delete</a>"; 
       table+="</td>";
                    table += "</tr>";
        }
    } 
    catch (SQLException ex) {
        Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    table+= "</table>";
            return table;
}
}
