<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="./resources/js/validation.js"></script>
<title>상품 등록</title>
</head>
<body>
<jsp:include page="menu.jsp" />
<div class="jumbotron">
   <div class="container">
      <h1 class="display-3">상품 등록</h1>
   </div>
</div>
<div class="container">
   <div class="container">
      <form name="newProduct" action="./processAddProduct.jsp" class="form-horizontal" method="post">
         <div class="form-group row">
            <label class="col-sm-2">상품 코드</label>
            <div class="col-sm-3">
               <input type="text" name="productId" class="form-control">
            </div>
         </div>
         <div class="form-group row">
            <label class="col-sm-2">상품명</label>
            <div class="col-sm-3">
               <input type="text" name="name" class="form-control">
            </div>
         </div>
         <div class="form-group row">
         <label class="col-sm-2">가격</label>
         <div class="col-sm-3">
         <input type="text" name="untPrice" class="form-control">
         </div>
         </div>
         <div class="form-group row">
         <label class="col-sm-2">제조사</label>
         <div class="col-sm-3">
         <input type="text" name="manufacturer" class="form-control">
         </div>
         </div>
         <div class="form-group row">
         <label class="col-sm-2">가격</label>
         <div class="col-sm-3">
         <input type="text" name="untPrice" class="form-control">
         </div>
         </div>
         <div class="form-group row">
         <label class="col-sm-2">분류</label>
         <div class="col-sm-3">
         <input type="text" name="category" class="form-control">
         </div>
         </div>
         <div class="form-group row">
         <label class="col-sm-2">재고 수</label>
         <div class="col-sm-3">
         <input type="text" name="unitsInStock" class="form-control">
         </div>
         </div>
         <div class="form-group row">
         <label class="col-sm-2">상태</label>
         <div class="col-sm-5">
         <input type="radio" name="condition" value="New">신규 제품
         <input type="radio" name="condition" value="Old">중고 제품
         <input type="radio" name="condition" value="Refurbished">재생 제품
         </div>
         </div> 
         <div class="form-group row">
         <div class="col-sm-offset-2 col-sm-10">
         <input type="submit" class="btn btn-primary" value="등록">
         </div>
         </div>
      </form>
   </div>
   </div>
</body>
</html>