<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>회원 가입</title>
</head>
<body>
	<div align="center">
		<h2>회원 가입 페이지</h2>
		<hr>
		<form action="inputOk">
			<table border="1" cellpadding="2" cellspacing="0" width="500">
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value=""/></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" name ="id" value=""/></td>
			</tr>
			<tr>
				<td>주민번호</td>
				<td><input type="text" name="memNo" value=""/></td>
			</tr>
			</table><br/>
			<input type="submit" value="전송" />
		</form>
	</div>
</body>
</html>