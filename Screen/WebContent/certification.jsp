<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title>로그인</title>
</head>
<body>
<h3>입력에 성공했습니다.</h3>
<%
   request.setCharacterEncoding("utf-8");
   String id = request.getParameter("id");
   String password = request.getParameter("password");
%>
<p> 아이디 : <%=id%>
<p> 비밀번호 : <%=password%>
<hr>
<a href="products.jsp">Home</a>
</body>
</html>