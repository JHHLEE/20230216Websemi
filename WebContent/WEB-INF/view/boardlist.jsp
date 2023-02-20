
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <script src="https://code.jquery.com/jquery-3.6.3.js"></script>
<section>
    	<h1>게시글 목록</h1>
    	
 <table>
		<tr>
			<td>글번호</td>
			<td>작성자</td>
			<td>제목</td>
			<td>내용</td>
			<td>작성일자</td>
		</tr>
	    <c:forEach items="${boardlist }" var="vo" varStatus="s">
				<td>${ vo.idx }: ${s.count }: ${s.index }</td>
				<td>${ vo.writer }</td>
				<td>${ vo.subject }</td>
				<td>${ vo.cont }</td>
				<td>${ vo.regdate }</td>
			</tr>
	    </c:forEach>
	</table>  
   <hr>
   <c:forEach items="${boardlist }" var="vo">
    	${vo.idx }<br>
    	${vo.Idx }<br>
    </c:forEach>


  <body>
    <table border="1">
        <tr>
              <tr>
              총 #개의 게시물이 있습니다
               <tr>
                  <th>번호</th>
                  <th>작성자</th>
                  <th>제목</th>
                  <th>작성일</th>
               <tr>
        	      <td>${vo.idx }</td>
                  <td>${vo.writer }</td>
                  <td>${vo.subject }</td>
                  <td>${vo.regdate }</td>
               <tr>
              </tr>
             
             
         </tr>
         
         
    </table>
    
      <tr>
              <button type="text" name="write" class="write">작성</button>
              
           <script>
           $(".write").on("click",Write);
           
           function write(){
           console.log("작성버튼 눌림");
    		location.href="<%=request.getContextPath()%>/boardwrite";    	   
	         }
           
           </script>

</body> 

    
    
    
    
 </section>