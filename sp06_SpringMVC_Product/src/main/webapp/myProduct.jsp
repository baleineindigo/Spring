<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>++++++++ 검색 결과 ++++++++</h2>
	<table border='2'>
	<thead>
		<tr>
			<th>도서코드</th><th>도서명</th><th>분류</th><th>출판사</th><th>저자</th><th>가격</th>
		</tr>
	</thead>
	<tbody>
 		<c:forEach items="${vo}" var="list">
		<tr>
			<td>${list.id}</td>
			<td>${list.name}</td>
			<td>${list.maker}</td>
			<td>${list.price}</td>
		</tr>
		</c:forEach>
	</tbody>
</table><p>

</body>
</html>