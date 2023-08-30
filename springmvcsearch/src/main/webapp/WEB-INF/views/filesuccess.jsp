<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>file uploaded result.....</title>
</head>
<body>
	<h1>${msg}</h1>

	<img alt="profile image"
		src="<c:url value="/resources/image/${filename}" />" />
</body>
</html>