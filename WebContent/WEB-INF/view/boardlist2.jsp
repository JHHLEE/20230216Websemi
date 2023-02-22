<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
</head>
<body>
<section>
<h3>개의 글이 있습니다</h3>
</section>

	<table>
		<tr>
		 <th>번호</th>
		 <th>작성자</th>
		 <th>제목</th>
		 <th>내용</th>
		 <th>작성일</th>
		</tr>
		<tr>
	    <c:forEach items="${boardlist }" var="vo" varStatus="s">
				<td>${ vo.idx }</td>
				<td>${ vo.writer }</td>
				<td>${ vo.subject }</td>
				<td>${ vo.cont }</td>
				<td>${ vo.regdate }</td>
		</c:forEach>
	    </tr>
	</table>
	

	
	
			
</body>
</html>