<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BOARD</title>
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
</head>
<body>
<header style="position:fixed ; top:10px ; width:100% ; height : 40px;
text-align : center; line-height : 40px";
font-size:30px;>커뮤니티사이트</header>
<section>


</section>
<br>
<jsp:include page="/WEB-INF/view/boardlist.jsp"></jsp:include>
<br>

<div style="border-1">
<footer style= "position:fixed; text-align :center;">Copyright (C) 2018 정보처리산업기사 ALL Right Reserved</footer>
</div>
</body>
</html>