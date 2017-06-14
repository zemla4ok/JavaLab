<%--
  Created by IntelliJ IDEA.
  User: Dmitry
  Date: 07.06.2017
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%@include file="Header.jsp"%><br>
<body>
    <form action="AddInf">
        <label>Enter your Name</label><br>
        <input type="text" name="Name" value="${param.Name}"><br>
        <label>Enter your Surname</label><br/>
        <input type="text" name="Surname" value="${param.Surname}"><br/>
        <input type="submit" value="Next">
    </form>
    <form action="hello.jsp">
        <input type="submit" value="Prev">
    </form>
</body>
<%@include file="Footer.jsp"%><br>
</html>
