<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Res</title>
</head>
<body>
	
	<c:forEach items="${requestScope.UsersList}" var="u">
		<tr>
			<td>${u.username }</td>
			<td>${u.password }</td>
		</tr>
	</c:forEach>

</body>
</html>