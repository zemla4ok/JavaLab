<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%--
  Created by IntelliJ IDEA.
  User: Dmitry
  Date: 09.06.2017
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>XML</title>
</head>
<body>
<c:import var="booksInformation" url="WEB-INF/books.xml"/>
<x:parse xml="${booksInformation}" var="info"/>
first book :
<x:out select="$info/books/book[1]/name"/><br>
second book :
<x:out select="$info/books/book[2]/name"/><br>
<h1>------------</h1>
<x:choose>
    <x:when select="$info/books/book[1]/author = 'Patsei NV'">
        book is writen by Natalia Vladimirivna
    </x:when>
    <x:when select="$info/books/book[1]/author = 'Smelov VV'">
        book is writen by Vladimir Vladislavovich
    </x:when>
    <x:otherwise>
        Unknown author
    </x:otherwise>
</x:choose>
<h1>-----------------</h1>
<c:import url="WEB-INF/stule.xsl" var="style"/>
<x:transform xml="${info}" xslt="${style}"/>
</body>
</html>
