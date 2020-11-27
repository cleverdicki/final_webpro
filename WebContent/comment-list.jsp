<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Comment Section</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: yellow">
			<div>
				<a href="https://www.xadmin.net" class="navbar-brand"> Comment Section </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Comments</a></li>
			</ul>
		</nav>
	</header>
	<br>

	<div class="row">
		<div class="alert alert-success" *ngIf='message'>{{message}}</div>

		<div class="container">
			<h3 class="text-center">List of Comments</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add
					New Comment</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Distributor</th>
						<th>Your Comment</th>
						<th>Time</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="comment" items="${listComment}">

						<tr>
							<td><c:out value="${comment.id}" /></td>
							<td><c:out value="${comment.name_film}" /></td>
							<td><c:out value="${comment.distributor_film}" /></td>
							<td><c:out value="${comment.comment_film}" /></td>
							<td><c:out value="${comment.timestamp}" /></td>
							<td><a href="edit?id=<c:out value='${comment.id}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?id=<c:out value='${comment.id}' />">Delete</a></td>
						</tr>
					</c:forEach>
		
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>