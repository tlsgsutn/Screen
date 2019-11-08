<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>화면 구현</title>
</head>
<body>
<%@ include file="menu.jsp"%>
<%! String greeting = "화면 구현";
String tagline = "Web";%>
<div class = "jumbotron">
   <div class = "container">
      <h1 class = "display-3">
         <%= greeting %>
      </h1>   
   </div>
</div>
<main role = "main">
<div class = "container">
   <div class = "text-center">
      <h3>
         <%= tagline %>
      </h3>
   </div>
   <hr>
</div>
</main>
<%@ include file="footer.jsp" %>
</body>
</html>