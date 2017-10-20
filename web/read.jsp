<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="newcss1.css">
    </head>
    <% String table = (String) request.getAttribute("table");%>
    <body>
        <div class ="format">
            <h1>Noopur's Movies</h1>
            <%= table%>

            <a href="add">Add A New Movie</a>
            <a href="search.jsp">Search Movies</a>
        </div>
    </body>
</html>
