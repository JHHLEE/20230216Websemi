<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <script src="https://code.jquery.com/jquery-3.6.3.js"></script>
<section>
    	<h1>게시글 목록</h1>
    	
   
 
  <c:forEach items="${boardlist }" var="vo">
    	${vo.idx }<br>
    </c:forEach>
    
    <hr>
 </section>