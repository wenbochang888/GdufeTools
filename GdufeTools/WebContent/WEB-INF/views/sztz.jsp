<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>sztz</title>
<%@ include file="bootstrap.jsp" %>
</head>
<body>

	<div class = "container">
		<div class = "panel panel-info"> <!-- panel-primary panel-info -->
			<div class = "panel-heading text-center">
				<h2>素质拓展</h2>
			</div>
			<div class = "panel-body">
				<table class = "table table-bordered table-hover">
					<thead>
						<tr>
							<th class="col-md-1 text-center">素拓模块名</th>
							<th class="col-md-1 text-center">所需最少学分</th>
							<th class="col-md-1 text-center">已修学分</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${requestScope.sztz.data }" var="s">
							<tr>
								<th class="col-md-1 text-center">${s.name }</th>
								<th class="col-md-1 text-center">${s.requireScore }</th>
								<th class="col-md-1 text-center">${s.score }</th>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>

</body>
</html>