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
        <div id="banner">
            <div class="box-left">
                <h2>
                    <span>THỨC ĂN</span>
                    <br>
                    <span>THƯỢNG HẠNG</span>
                </h2>
                <p>Chuyên cung cấp các món ăn đảm bảo dinh dưỡng
                    hợp vệ sinh đến người dùng,phục vụ người dùng 1 cái
                    hoàn hảo nhất</p>
                <button><a href="sanpham">Mua ngay</a></button>
            </div>
            <div class="box-right">
                <img src="style/assets/img_1.png" alt="">
                <img src="style/assets/img_2.png" alt="">
                <img src="style/assets/img_3.png" alt="">
            </div>
            <div class="to-bottom">
                <a href="">
                    <img src="style/assets/to_bottom.png" alt="">
                </a>
            </div>
        </div>
	<jsp:include page="include/footer.jsp"></jsp:include>
    </div>
    <script src="style/js/script.js"></script>
</body>
</html>