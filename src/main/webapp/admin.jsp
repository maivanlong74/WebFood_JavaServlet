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
	<title>ADMIN</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <link rel="stylesheet" href="style/css/style.css">
    <link rel="stylesheet" href="style/css/sanpham.css">
</head>
<body>
	<div id="wrapper">
        <div id="header">
            <a href="dangnhapadmin.html" class="logo">
                <img src="../assets/logo.jpg" alt="" width="75px">
            </a>
            <div id="menu">
                <div class="item">
                    <a href="quanlysanpham">Quản lý sản phẩm</a>
                </div>
                <div class="item">
                    <a href="duyetdonadmin">Duyệt đơn</a>
                </div>
                <div class="item">
                    <a href="danhsachschuyentien">Xem danh sách chuyển tiền</a>
                </div>
                <div class="item">
                    <a href="phanhoi">Nhận phản hồi</a>
                </div>
            </div>
            <div id="actions">
                <a class="item" href="dangxuatadmin">
                    <img src="style/assets/logout.png" alt="">
                </a>
            </div>
        </div>
        <div id="banner" style="margin-top: 88px;">
            <div class="box-left">
                <h2>
                    <span>THỨC ĂN</span>
                    <br>
                    <span>THƯỢNG HẠNG</span>
                </h2>
                <p>Tiêu chí: <br> 
                		1, Cung cấp dịch vụ tốt nhất <br>
              	     	2, Khách hàng là thượng đế</p>
                
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
    </div>
    <script src="style/js/script.js"></script>
</body>
</html>