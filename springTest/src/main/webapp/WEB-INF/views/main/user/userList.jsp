<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user List</title>
</head>
<% String path= request.getContextPath(); %>
<style>
	table, tr, th, td{border-style:solid; text-align: center;}
	table{border: 1px; border-collapse: collapse; width: 70%;}
</style>
<body>
	<h3>이용자 목록</h3>
	<form id="userListForm">
		<table>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Address</th>
				<th>Email</th>
			</tr>
			<c:forEach var="user" items="${userList }">
				<tr>
					<td>${user.userId }</td>
					<td>${user.name }</td>
					<td>${user.address }</td>
					<td>${user.email }</td>
				</tr>
			</c:forEach>
		</table>
	</form>
	
	<br>
	<a href="<%=path%>/goAddPage.do">등록자 추가</a>
</body>
</html>