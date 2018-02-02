<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book</title>
<%@ include file="bootstrap.jsp" %>
</head>
<body>

	<div class = "container">
		<div class = "panel panel-info"> <!-- panel-primary panel-info -->
			<div class = "panel-heading text-center">
				<h2>当前借阅</h2>
			</div>
			<div class = "panel-body">
				<table class = "table table-bordered table-hover">
					<thead>
						<tr>
							<th class="col-md-1 text-center">条码号</th>
							<th class="col-md-1 text-center">书名</th>
							<th class="col-md-1 text-center">作者</th>
							<th class="col-md-1 text-center">借阅时间</th>
							<th class="col-md-2 text-center">应归还时间</th>
							<th class="col-md-1 text-center">已续借次数</th>
							<th class="col-md-1 text-center">馆藏地</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${requestScope.book.data }" var="b">
							<tr>
								<th class="col-md-1 text-center">${b.barId }</th>
								<th class="col-md-1 text-center">${b.name }</th>
								<th class="col-md-1 text-center">${b.author }</th>
								<th class="col-md-1 text-center">${b.borrowedTime }</th>
								<th class="col-md-1 text-center">${b.returnTime }</th>
								<th class="col-md-1 text-center">${b.renewTimes }</th>
								<th class="col-md-1 text-center">${b.location }</th>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>

</body>
</html>