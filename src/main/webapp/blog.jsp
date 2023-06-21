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
	<title>BLOG</title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <link rel="stylesheet" href="style/css/style.css">
    <link rel="stylesheet" href="style/css/blog.css">
</head>
<body>
	<div id="wrapper">
        <jsp:include page="include/head.jsp"></jsp:include>
        <div class="head-two">
            <form action="" id="search-box">
                <input type="text" id="search-text" placeholder="Tìm sản phẩm" required>
                <button id="search-btn"><i class="fa-solid fa-magnifying-glass"></i></button>
            </form>
        </div>
        <div class="noidung">
            <div class="video">
                <video autoplay loop muted plays-inline class="video_top" width="400px">
                    <source src="style/video/food.mp4" type="video/mp4">
                </video>
            </div>
            <div class="bantin"> 
                <a href="https://baomoi.com/am-thuc.epi" class="one">
                    <h3>* Ẩm thực, tin ẩm thực, vệ sinh an toàn thực phẩm - BAOMOI.COM</h3>
                    <p>Thông tin văn hóa ẩm thực, tin ẩm thực, món ngon mỗi ngày, bí quyết nấu ăn ngon.</p>
                </a> <hr>
                <a href="https://thanhnien.vn/doi-song/am-thuc/" class="one">
                    <h3>* Ẩm thực Việt Nam - Ý tưởng sáng tạo, văn hoá ăn uống 3 miền</h3>
                    <p>Ẩm thực ba miền Việt Nam - Ý tưởng, sáng tạo ẩm thực 3 miền của người Việt. Văn hoá ăn uống độc đáo khắp các miền đất nước, lễ hội ẩm thực thế giới.</p>
                </a> <hr>
                <a href="https://2sao.vn/mon-an-viet-nam-t-49439.html" class="one">
                    <h3>* Món ăn Việt Nam - 2Sao</h3>
                    <p>món ăn Việt Nam - Xem tin tức, hình ảnh, video clip mới nhất, chính xác nhất trên ... Nhiều người Việt tàn phá bản thân vì thói quen ăn uống ngược đời.</p>
                </a> <hr>
                <a href="https://vietnamnet.vn/doi-song/am-thuc" class="one">
                    <h3>* Ẩm thực - Các món ăn đặc sắc Việt Nam vs thế giới</h3>
                    <p>Ẩm thực Việt Nam và Thế giới - Giới thiệu các món ăn ngon, đặc sắc, các văn hóa ẩm thực đa dạng trên thế giới. Chia sẻ bí quyết nấu ăn ngon lành cho gia ...</p>
                </a>
            </div>
        </div>
	<jsp:include page="include/footer.jsp"></jsp:include>
    </div>
    <script src="style/js/script.js"></script>
</body>
</html>