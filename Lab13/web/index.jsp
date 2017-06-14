<%--
  Created by IntelliJ IDEA.
  User: Dmitry
  Date: 06.06.2017
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="javaBean" scope="application" class="testBean.JavaBeanDate"/>
<html>
  <head>
    <title>Lab13</title>
  </head>
  <%@include file="Header.jsp"%><br>
  <body>
<jsp:getProperty name="javaBean" property="date"/><br>
    <form action="Login">
      <label>Name</label><br>
      <input type="text" name="userName"><br>
      <label>Password</label><br>
      <input type="text" name="userPass"><br>
      <input type="submit" value="log_in">
    </form>
  </body>
<%@include file="Footer.jsp"%><br>
<%@ page errorPage="error.jsp"%>
</html>
