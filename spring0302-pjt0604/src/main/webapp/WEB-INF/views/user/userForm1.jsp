<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 정보 입력</title>
</head>
<body>
<div align="center">
<h2>회원 정보 입력</h2>
  <hr/>
  
  <form action = "userSave" method="post">
  <table border="1" cellpadding="2" cellspacing="0">
  <tr>
  <td>이름</td>
  <td><input type="text" name="name" value="${userVO.name}"/></td>
  </tr>
  <tr>
  <td>주소</td>
  <td><input type="text" name="address" value="${userVO.address }"/></td>
  </tr>
  
  <tr>
  <td>취미</td>
  <td><input type="text" name="hobby" value="${userVO.hobby }"/></td>
  </tr>
  
  </table>
  
  <input type ="submit" value="등록"/>
  </form>
</div>


</body>
</html>