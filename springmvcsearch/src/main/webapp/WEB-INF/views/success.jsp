<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Name is ${student.name }</h1>
<h1>ID is ${student.id}</h1>
<h1>Date OF Birth is ${student.dob }</h1>
<h1>courses is ${student.cources}</h1>
<h1>student gender is ${student.gender }</h1>
<h1>student type is ${student.type }</h1>
<hr>

<h1>Address street is ${student.address.street }</h1>
<h1>Address city is ${student.address.city }</h1>
</body>
</html>