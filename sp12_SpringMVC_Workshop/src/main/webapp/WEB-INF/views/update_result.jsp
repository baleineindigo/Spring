<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>${param.name} 님의 정보를 수정하셨습니다...</h3>
	<ul>
		<li>${param.id}</li>
		<li>${param.password}</li>
		<li>${param.address}</li>
	</ul>
	<a href="index.jsp">홈으로</a>
</body>
</html>