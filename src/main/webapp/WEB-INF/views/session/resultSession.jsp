<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>resultSession.jsp<hr>
	id : ${requestScope.id }, ${sessionScope.id }<br>  <!-- 현재 범위가 가장 작은게 우선시. 모델값 requestScopt.id -->
	name : ${name }, ${sessionScope.name }<br> <!-- name은 세션에 있는 name -->
	<hr>
	<a href="make_session">make_session</a>
	<a href="del_session">del_session</a>
	
</body>
</html>