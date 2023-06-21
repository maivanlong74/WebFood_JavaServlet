<%@page import="bean.sanphambean"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="shortcut icon" href="style/assets/logo.jpg">
	<title>Web bán thức ăn </title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <link rel="stylesheet" href="style/css/style.css">
    <link rel="stylesheet" href="style/css/sanpham.css">
</head>
<body>
	<div id="wrapper">
        <jsp:include page="include/head.jsp"></jsp:include>
		<div class="head-two">
             <form action="sanpham" id="search-box">
                 <input name="txttk" type="text" id="search-text" placeholder="Tìm sản phẩm" required>
                 <button id="search-btn" name="butt"><i class="fa-solid fa-magnifying-glass"></i></button>
             </form>
       	</div>
        <div id="wp-products">
            <h2>SẢN PHẨM CỦA CHÚNG TÔI</h2>
            <div class="list-page">
            <c:forEach begin="1" end="${dem}" var="i">
                <div class="item">
                    <a href="sanpham?index=${i}">${i}</a>
                </div>
             </c:forEach>
            </div>
            <ul id="list-products">
    		<c:forEach items="${dssanpham}" var="s">
                <div class="item">
                    <img src="style/sanpham/${s.anh}" alt="" style=" margin-top: 0; 
		                    												height: 163px; 
		                    												margin-top: 0;
																		    max-height: 163px;
																		    height: 163px;
																		    max-width: 100%;
																		    width: 290px;">
                    <div class="stars">
                        <span>
                            <img src="style/assets/star.png" alt="">
                        </span>
                        <span>
                            <img src="style/assets/star.png" alt="">
                        </span>
                        <span>
                            <img src="style/assets/star.png" alt="">
                        </span>
                        <span>
                            <img src="style/assets/star.png" alt="">
                        </span>
                        <span>
                            <img src="style/assets/star.png" alt="">
                        </span>
                    </div>
					<a href="giohang?ms=${s.masanpham}&anh=${s.anh}&ts=${s.tensanpham}&gia=${s.gia}" class="buy-now">mua ngay</a>
                    <div class="name">${s.tensanpham}</div>
                    <div class="desc">${s.maloai}</div>
                    <div class="price">${s.gia}.VDN</div>
                </div>
			<%-- <%} %> --%>
				</c:forEach>
            </ul>
            
        </div>

        <div id="saleoff">
            <div class="box-left">
                <h1>
                    <span>GIẢM GIÁ LÊN ĐẾN</span>
                    <span>45%</span>
                </h1>
            </div>
            <div class="box-right"></div>
        </div>

	<jsp:include page="include/footer.jsp"></jsp:include>
    </div>
    <script src="style/js/script.js"></script>
</body>
</html>