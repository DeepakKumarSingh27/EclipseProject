<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is help page</h1>
	<%
	/* String name = (String) request.getAttribute("name");
	Integer rollno = (Integer) request.getAttribute("rollno");
	LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */
	%>
	<h1>
		Hello my name is
		<%-- <%=name%>--%>
		${name }
	</h1>
	<h1>
		my rollno is
		<%-- <%=rollno%>--%>
		${rollno }
	</h1>

	<h1>
		Date And Time is ${time }
		<%-- <%=time %>--%>

	</h1>

	<hr>

	<c:forEach var="item" items="${marks }">
		<h1>${item }</h1>
	</c:forEach>

</body>
</html>