<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Disney Movies</title>
        <link rel="stylesheet" type="text/css" href="newcss.css">
    </head>
    <body>
        <div class="wrap">
            <%@ include file= "header.jsp" %>
            <%@ include file= "menu.jsp" %>
            <div class="main">
        <h1>My Movies Database</h1>
        <a href="read">View all Movies</a>
        <br> <br>
        <a href="search.jsp">Search Movies</a>
            </div>
        <%@ include file= "footer.jsp" %>
        </div>
        </body>
  
</html>
