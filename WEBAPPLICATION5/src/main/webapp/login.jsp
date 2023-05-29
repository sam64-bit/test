<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "java.io.*" %>  
<%@ page import= "javax.servlet.*" %>
<%@ page import= " java.sql.*" %>
<%@ page import="javax.servlet.http.*"%>
<%@ page import="javax.servlet.jsp.*"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body bgcolor="yellow">
<%
out.println(request.getParameter("t1"));
out.println(request.getParameter("t2"));

%>
</body>
</html>





