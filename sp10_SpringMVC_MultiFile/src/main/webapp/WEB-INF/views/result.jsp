<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div{
	border:1px dotted navy;
	}
</style>
</head>
<body>
	<h2 align="center">Result Of Executing Deep Learning Model</h2>
	<h3 align="center">Model Performance</h3>
	<div align="center">
		<img alt="loss" src="${loss_plot}" width="30%" height="30%">
		<img alt="acc" src="${acc_plot}" width="30%" height="30%">
	</div>
</body>
</html>