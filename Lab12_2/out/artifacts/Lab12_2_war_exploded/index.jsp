<%--
  Created by IntelliJ IDEA.
  User: Dmitry
  Date: 06.06.2017
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <H1>Start page</H1><br>
  <form action="Servlet1" method="get">
    <input type="submit" value="to servlet 1 by get">
  </form>

  <form action="Servlet1" method="post">
    <input type="submit" value="to servlet 1 by post">
  </form>

  <form action="S1" method="get">
    <input type="submit" value="gen req from 1 to 2">
  </form>
  </body>
</html>
