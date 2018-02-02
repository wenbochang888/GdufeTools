<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Information</title>
<%@ include file="bootstrap.jsp" %>
</head>
<body>
	
	
	<div class = "container">
		<div class = "panel panel-info"> <!-- panel-primary panel-info -->
			<div class = "panel-heading text-center">
				<h2>个人信息</h2>
			</div>
			<div class = "panel-body">
				<table class = "table table-bordered table-hover">
					<tbody>
						<tr>
							<th class="col-md-1 text-center">学院</th>
							<th class="col-md-1 text-center">${requestScope.info.data.department }</th>
						</tr>
						<tr>
							<th class="col-md-1 text-center">院系</th>
							<th class="col-md-1 text-center">${requestScope.info.data.major }</th>
						</tr>
						<tr>
							<th class="col-md-1 text-center">班级</th>
							<th class="col-md-1 text-center">${requestScope.info.data.classroom }</th>
						</tr>
						<tr>
							<th class="col-md-1 text-center">姓名</th>
							<th class="col-md-1 text-center">${requestScope.info.data.name }</th>
						</tr>
						<tr>
							<th class="col-md-1 text-center">性别</th>
							<th class="col-md-1 text-center">${requestScope.info.data.sex }</th>
						</tr>
						<tr>
							<th class="col-md-1 text-center">生日</th>
							<th class="col-md-1 text-center">${requestScope.info.data.birthday }</th>
						</tr>
						<tr>
							<th class="col-md-1 text-center">党派</th>
							<th class="col-md-1 text-center">${requestScope.info.data.party }</th>
						</tr>
						<tr>
							<th class="col-md-1 text-center">名族</th>
							<th class="col-md-1 text-center">${requestScope.info.data.nation }</th>
						</tr>
						<tr>
							<th class="col-md-1 text-center">学历</th>
							<th class="col-md-1 text-center">${requestScope.info.data.education }</th>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	
</body>
</html>