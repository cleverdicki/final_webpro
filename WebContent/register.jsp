<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<mt:layout title="Login">
	<jsp:attribute name="content">
		<div class="container mt-4">
			<div class="box">
				<h2>Register</h2>
				<form action="register" method="post">
				<div class="box-input">
					<input type="text" name="name_user">
					<label>Name</label>
				</div>
				<div class="box-input">
					<input type="text" name="email_user">
					<label>Email</label>
				</div>
				<div class="box-input">
					<input type="password" name="password_user">
					<label>Password</label>
				</div>
				<input type="submit"  class="btn btn-primary mt-1 mb-1 mr-2 pt-1 pb-1" value="Register">
				<a href="login.jsp">Login!</a>
				</form>
			</div>
		</div>
	</jsp:attribute>
</mt:layout>