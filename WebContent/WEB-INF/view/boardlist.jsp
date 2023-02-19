<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <script src="https://code.jquery.com/jquery-3.6.3.js"></script>
<section>
    	<h1>게시글 목록</h1>
    	
   
 
  <c:forEach items="${boardlist }" var="vo">
    	${vo.Idx }<br>
    </c:forEach>
 
    
    <hr>
  <body>
    <table border="1">
        <tr>
           <th>커뮤니티 사이트</th>
             <tr>
              총 #개의 게시물이 있습니다
               <tr>
                  <td>번호</td>
                  <td>작성자</td>
                  <td>제목</td>
                  <td>작성일</td>
               <tr>
                  <td>(번호) </td>
                  <td>(작성자)</td>
                  <td>(제목)</td>
                  <td>(작성일)</td>
               <tr>
               <tr>
              <button type="text" name="write">작성</button>
            </tr>
              
         </tr>
    </table>
</body>  
    
    
    
    
 </section>