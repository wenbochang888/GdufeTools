<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Grade</title>
<%@ include file="bootstrap.jsp" %>
</head>
<body>

	<div class = "container">
		<div class = "panel panel-info"> <!-- panel-primary panel-info -->
			<div class = "panel-heading text-center">
				<h2>成绩</h2>
			</div>
			<div class = "panel-body">
				<table class = "table table-bordered table-hover">
					<thead>
						<tr>
							<th class="col-md-1 text-center">课程名</th>
							<th class="col-md-1 text-center">学年学期</th>
							<th class="col-md-1 text-center">总分</th>
							<th class="col-md-1 text-center">学分</th>
							<th class="col-md-1 text-center">平时成绩</th>
							<th class="col-md-1 text-center">实验成绩</th>
							<th class="col-md-1 text-center">期末卷面成绩</th>
							<th class="col-md-1 text-center">考试类型</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${requestScope.grade.data }" var="g">
							<tr>
								<th class="col-md-1 text-center">${g.name }</th>
								<th class="col-md-1 text-center">${g.time }</th>
								<th class="col-md-1 text-center">${g.score }</th>
								<th class="col-md-1 text-center">${g.credit }</th>
								<th class="col-md-1 text-center">${g.dailyScore }</th>
								<th class="col-md-1 text-center">${g.expScore }</th>
								<th class="col-md-1 text-center">${g.paperScore }</th>
								<th class="col-md-1 text-center">${g.examType }</th>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>

</body>
</html>