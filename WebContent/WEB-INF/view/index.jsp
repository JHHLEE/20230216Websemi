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
	<header	style="position: fixed; top: 10px; width: 100%; height: 40px; text-align: center; line-height: 40px; font-size:30px;">커뮤니티사이트</header>

<br>
		<jsp:include page="/WEB-INF/view/boardlist.jsp"></jsp:include>
<br>
<table>
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>아이디</th>
		<th>조회수</th>
		<th>작성일</th>
	<c:forEach items="${boardlist }" var="vo" varStatus="s">
				<td>&nbsp;${ vo.Idx }: ${s.count }: ${s.index }</td>
				<td>${ vo.Subject }</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;${ vo.Writer }</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;${ vo.Cont }</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;${ vo.Regdate }</td>
	  </c:forEach>
</table>


	<div >
		<footer style="position: fixed; text-align: center;">Copyright(C) 2018 정보처리산업기사 ALL Right Reserved</footer>
	</div>
</body>
</html>