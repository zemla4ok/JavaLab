<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="my" uri="MyTag.tld" %>
<html>
<head>
    <title>Laba 14</title>
</head>
<body>

<form action="core.jsp">
    <input type="submit" value="core">
</form>

<form action="formated.jsp">
    <input type="submit" value="formated">
</form>

<form action="xml.jsp">
    <input type="submit" value="xml">
</form>

<form action="functions.jsp">
    <input type="submit" value="functions">
</form>

<form action="Result.jsp" method="post">
    <my:KDVLabledTextField label="Name: " name="Firstname"/><br/>
    <my:KDVLabledTextField label="Surname: " name="Surname"/><br/>
    <my:KDVLabledTextField label="Fathername: " name="FatherName"/><br/>
    <my:KDVLabledTextField label="City: " name="City"/><br/>
    <my:KDVLabledTextField label="Street: " name="Street"/><br/><br/>
    <my:KDVsubmit/>
</form>
</body>
</html>
