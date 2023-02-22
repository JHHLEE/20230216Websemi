<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
</head>
<body>
<jsp:include page="/WEB-INF/view/header.jsp"/>
	<hr>
	<h3>게시글작성</h3>
 <form method="post" action="<%=request.getContextPath()%>/boardwrite">
 <br>
	작성자:<input type="text" name="writer">
			<br>
	제목:<input type="text" name="subject">
			<br>
	내용:<input type="text" name="cont">
			<br>
	<button type="submit">작성</button>
  </form> 
 

</body>
</html>