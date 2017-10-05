<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <% String table= (String) request.getAttribute("table"); %>
    <body>
        <h1>Noopur's Movies</h1>
        <%= table %>
        
        <a href="add">Add A New Movie</a>
        
    </body>
</html>
