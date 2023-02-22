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
		
        <tr align="right">
         <td width="100"><button type="button"
                onclick="location.href='../semi/boardwrite';">글쓰기</button></td>
        </tr>
  

</div>

<!-- <section> -->
<!-- 		<button type="button" class="btn write" onclick="location.href='/boardwrite';">작성</button> -->
<!-- </section> -->
	



	<jsp:include page="/WEB-INF/view/footer.jsp"/>
</body>
</html>