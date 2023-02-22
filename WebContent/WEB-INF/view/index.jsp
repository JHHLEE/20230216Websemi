<%@page import="board.model.service.BoardService"%>
<%@page import="board.model.dao.BoardDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BOARD</title>
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
</head>
<body>
	<jsp:include page="/WEB-INF/view/header.jsp"/>

<br>
		<jsp:include page="/WEB-INF/view/boardlist.jsp"></jsp:include>
<br>


<div>
<section>
		<form action="<%=request.getContextPath()%>/boardwrite" method="post">
			<button type="submit">글작성</button>
		</form>
	</section>
</div>



	<jsp:include page="/WEB-INF/view/footer.jsp"/>
</body>
</html>