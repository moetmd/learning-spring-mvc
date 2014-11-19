<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<style type="text/css">
.user_div
{
	width:30%;
	margin:5px,5px,5px,5px;
	padding:5px,5px,5px,5px;
	background-color: gray;
}

</style>

<title>登陆成功</title>
</head>
<body>
		<h1>登陆成功</h1>
		
		<c:if test="${not empty userlist }">
			<c:forEach var="user" items="${userlist }">
				<div class="user_div">${user.id }_____${user.name }_____${user.sex }</div><br>
			</c:forEach>
		</c:if>
</body>
</html>