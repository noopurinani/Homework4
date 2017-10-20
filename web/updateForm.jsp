<%@page import="model.Movie"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% Movie movie= (Movie)request.getAttribute("movie");%>
    <!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update a Movie</title>
        <link rel="stylesheet" type="text/css" href="newcss2.css">
    </head>
    <body>
        
        <h1>Update a Movie</h1>
        <form name="updateForm" action="updateMovie" method="post">
            <label>Movie ID:</label>
            <input type="text" name="movieid" value="<%= movie.getMovieid()%>" readonly/>
            <br>
            <label>Movie Name:</label>
            <input type="text" name="name" value="<%= movie.getMoviename()%>"/>
            <br>
            <label>Year Released:</label>
            <input type="text" name="YearReleased" value="<%=movie.getYearreleased()%>"/>
            <br>
            <label>Genre:</label>
            <input type="text" name="Genre" value="<%=movie.getGenre()%>"/>
            <br>
            <label>Producer:</label>
            <input type="text" name="Producer" value="<%=movie.getProducer()%>"/>
            <br>
            <input type="submit" name="submit" value="Update"/>
        
           
    </body>
</html>

