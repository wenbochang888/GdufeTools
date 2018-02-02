<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="bootstrap.jsp" %>
</head>
<body>
	
	<c:if test="${requestScope.error != null}">
  		<div class="alert alert-danger">
	    	<h3 class="center-block">
				<strong>${requestScope.error}</strong>
			</h3>
    	</div>
  	</c:if>
	
	<div class="container">
      <form class="form-signin" action="doLogin" method="post">
        <h2 class="form-signin-heading">未登录</h2>
        <input type="text" name="sno" class="form-control" placeholder="学号">
        <input type="password" name="pwd" class="form-control" placeholder="密码">
        <button class="btn btn-lg btn-primary btn-block" type="submit">submit</button>
      </form>
    </div>
    
</body>
</html>