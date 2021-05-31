<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2>User 폼 페이지</h2>
<hr />
<%  String context = request.getContextPath(); %>
<form action="<%=context%>/userInfo" method="post">
<table border="1" cellpadding="2" cellspacing="0" >
<tr>
<td>이름:</td>
<td><input type="text" name="name"/></td>
</tr>

<tr>
<td>나이:</td>
<td><input type="text" name="age"/></td>
</tr>

<tr>
<td>성별:</td>
<td><input type="text" name="gender"/></td>
</tr>

<tr>
<td>키 :</td>
<td><input type="text" name="height"/></td>
</tr>

<tr>
<td>몸무게:</td>
<td><input type="text" name="weight"/></td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="등록"/></td>
</tr>
</table>
</form>
 
</div>
</body>
</html>