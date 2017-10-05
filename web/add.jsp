

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a Movie</title>
    </head>
    <body>
        <h1>Add a new Movie</h1>
        <form name="addForm" action="addMovie" method="get">
            <label>Movie Name:</label>
            <input type="text" name="name" value=""/>
            <br>
            <label>Year Released:</label>
            <input type="text" name="YearReleased" value=""/>
            <br>
            <label>Genre:</label>
            <input type="text" name="Genre" value=""/>
            <br>
            <label>Producer:</label>
            <input type="text" name="Producer" value=""/>
            <br>
            <input type="submit" name="submit" value="Submit"/>
        </form>
           
    </body>
</html>
