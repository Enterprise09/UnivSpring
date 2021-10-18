<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>write_view</title>
</head>
<body>
	<p><img src="/board/resources/write_title.png" /></p>
	<table width="600" cellpadding="1" cellspacing="1" border="1">
		<form action="write" method="post">
			<tr>
				<td>이름 </td>
				<td><input type="text" name="b_name" size="60"></td>
			</tr>
			<tr>
				<td>제목 </td>
				<td><input type="text" name="b_subject" size="60"></td>
			</tr>
			<tr>
				<td>내용 </td>
				<td>
					<textarea name="b_content" rows="10"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="5"><input type="submit" value="입력"> &nbsp;&nbsp; <a href="list.do">목록보기</a></td>
			</tr>
		</form>
	</table>
</body>
</html>