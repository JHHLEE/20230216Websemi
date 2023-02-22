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

	<hr>
	<h3>게시글작성</h3>
 <form method="post" name="write" action="<%=request.getContextPath()%>/boardlist">
 <table border="1" width="90%">
    <tr>
        <td>작성자</td>
        <td>
            <input type="text" name="name" style="width:150px;" />
        </td>
    </tr>
    <tr>
        <td>제목</td>
        <td>
            <input type="text" name="subject" style="width:80%;" />
        </td>
    </tr>
    <tr>
        <td>내용</td>
        <td>
            <textarea name="cont" style="width:80%;height:70px;"></textarea>
        </td>
    </tr>
   <tr>
        <td colspan="2" align="right">
            <button type="submit" onclick="location.href='../mvcboard/list.do';">작성 완료</button>
                    
        </td>
    </tr>
   
    
</table>    
  </form> 
 

</body>
</html>