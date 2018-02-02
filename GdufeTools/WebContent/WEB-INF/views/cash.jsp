<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cash</title>
<%@ include file="bootstrap.jsp" %>
</head>
<body>

	<div class = "container">
		<div class = "panel panel-info"> <!-- panel-primary panel-info -->
			<div class = "panel-heading text-center">
				<h2>饭卡余额 </h2>
			</div>
			<div class = "panel-body text-center">
				<h2>¥${requestScope.cash.data.cash }</h2>
			</div>
		</div>
	</div>

</body>
</html>