<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta ttp-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>회원정보입력</title>
</head>
<body>
<div align="center" >
  <hr  whith="400" color="red" />
  <h2>회원정보입력</h2>
  <hr whith="400" color="red" />

<form action="userSave.sp"  method="POST">
 <table border="1">
 
 <tr>
  <td>이름</td>
  <td><input type="text" name="userName" value=""/></td>
 </tr>
  <tr>
    <td>주소</td>
    <td><input type="text" name="address" value=""/></td>
  </tr>
 <tr>
    <td>취미</td>
    <td>
    <c:forEach var="hobby" items="${customerId}"> ${hobby},&nbsp;
    </c:forEach>
   </td>
   </tr>
   </table>
    
    <input type="submit" name="submit" value="등록"/>
     
</form>
</div>
</body>
</html>
