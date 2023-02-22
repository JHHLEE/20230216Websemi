<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section>
    <h1>게시글 목록</h1>
   
	
	<table  border="1" width="90%">
		<tr>
<!-- 			<td>글번호</td> -->
<!-- 			<td>제목</td> -->
<!-- 			<td>작성자</td> -->
<!-- 			<td>내용</td> -->
<!-- 			<td>작성시간</td> -->
			<th width="10%">번호</th>
            <th width="15%">작성자</th>
            <th width="10">제목</th>
            <th width="20%">내용</th>
            <th width="15%">작성일</th>
            
		</tr>
	    <c:forEach items="${boardlist }" var="vo" varStatus="s">
				<td>&nbsp;${ vo.idx }</td>
				<td>&nbsp;${ vo.writer }</td>
				<td>&nbsp;${ vo.subject }</td>
				<td>&nbsp;${ vo.cont }</td>
				<td>&nbsp;${ vo.regdate }</td>
			</tr>
	
	    </c:forEach>
	</table>  
	


</section>
    