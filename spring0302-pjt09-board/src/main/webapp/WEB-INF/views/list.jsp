<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>list</title>
</head>
<body>
	<p><img src="/board/resources/list_title.png" /></p>
	<table width="600" cellpadding="1" cellspacing="1" border="2">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>제목</td>
			<td>날짜</td>
		</tr>
		<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.b_no}</td>
				<td>${dto.b_name}</td>
				<td><a href="content_view?b_no=${dto.b_no}">${dto.b_subject}</a></td>
				<td>${dto.b_date}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="7">
				<a href="write_view">
					<img src="/board/resources/write_b.gif">
				</a>
			</td>
		</tr>		
	</table>
</body>
</html>