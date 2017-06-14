<%--
  Created by IntelliJ IDEA.
  User: Dmitry
  Date: 07.06.2017
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
    <%@include file="Header.jsp"%><br>
<body>
${Name}<br>
${Surname}<br>
<form action="addEmail.jsp">
    <label>Enter your city</label><br>
    <input type="text" name="City" value="${param.City}"><br>
    <input type="submit" value="Next">
</form>
<form action="hello.jsp">
    <input type="submit" value="Home">
</form>
<form action="addInf.jsp">
    <input type="text" name="Name" value="${Name}"><br>
    <input type="text" name="Surname" value="${Surname}"><br>
    <input type="submit" value="Prev">
</form>
</body>
<%@include file="Footer.jsp"%><br>
</body>
</html>
