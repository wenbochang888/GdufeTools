<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Schedule</title>
<%@ include file="bootstrap.jsp" %>
</head>
<body>

	<div class = "container">
		<div class = "panel panel-info"> <!-- panel-primary panel-info -->
			<div class = "panel-heading text-center">
				<h2>课程表(作者能力有限，实在画不出来那种表格)</h2>
			</div>
			<div class = "panel-body">
				<table class = "table table-bordered table-hover">
					<thead>
						<tr>
							<th class="col-md-1 text-center">课程名</th>
							<th class="col-md-1 text-center">上课老师</th>
							<th class="col-md-1 text-center">上课教室</th>
							<th class="col-md-2 text-center">周几</th>
							<th class="col-md-1 text-center">开始小节</th>
							<th class="col-md-1 text-center">结束小节</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${requestScope.schedule }" var="s">
							<tr>
								<th class="col-md-1 text-center">${s.name }</th>
								<th class="col-md-1 text-center">${s.teacher }</th>
								<th class="col-md-1 text-center">${s.location }</th>
								<th class="col-md-1 text-center">${s.dayInWeek }</th>
								<th class="col-md-1 text-center">${s.startSec }</th>
								<th class="col-md-1 text-center">${s.endSec }</th>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>

</body>
</html>