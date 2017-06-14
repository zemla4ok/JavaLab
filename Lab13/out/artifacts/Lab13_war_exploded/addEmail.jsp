<%--
  Created by IntelliJ IDEA.
  User: Dmitry
  Date: 07.06.2017
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%@include file="Header.jsp"%><br>
<body>
    <form action="hello.jsp">
        <label>Enter your E-mail</label><br/>
        <input type="text" name="Email" value="${param.Email}"><br/>
        <input type="submit" value="home">
    </form>
    <form action="addAdress.jsp">
        <input type="text" name="City" value="${param.City}"><br>
        <input type="submit" value="Prev">
    </form>
</body>
<%@include file="Footer.jsp"%><br>
</html>
