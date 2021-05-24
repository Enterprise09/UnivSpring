<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

	<P>  The time on the server is ${serverTime}. </P>
	<a href="board/content">content.jsp</a><br>
	<a href="board/reply">reply.jsp</a><br>
</body>
</html>
