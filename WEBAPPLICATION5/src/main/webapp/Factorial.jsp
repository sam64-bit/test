<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial Calculation</title>
</head>
<body bgcolor="skyblue">
<%
int number;
long fact=1;
number=Integer.parseInt(request.getParameter("n"));
while(number>0) {
	fact=fact*number;
	number--;
}
out.print("<h2> Factorial is </h2>");
out.print("<h2>"+fact+"</h2>");

%>
</body>
</html>


