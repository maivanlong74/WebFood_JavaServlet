<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>ĐĂNG NHẬP</title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="style/css/dangnhap1.css">
    <link rel="stylesheet" href="style/css/dangnhap2.css">
    <link rel="shortcut icon" href="style/assets/logo.jpg">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css">
</head>
<body>
	<a href="trangchu" class="quaylai">
        <img src="style/assets/prev.png" alt="">
    </a>
	<div class="dangnhap">
		<form action="taifile" class=login enctype= "multipart/form-data" method="post">
            <!-- <input type="file" class="txtfile" placeholder="File ảnh" name="txtfile" style="color: #fff;margin-top: 47px;"> -->
            <h1 class="heard">Đăng ký</h1>
            <div class="form-group">
                <input type="text" class="form-input" placeholder="Mã sản phẩm" name="masanpham">
            </div>
            <div class="form-group">
                <input type="text" class="form-input" placeholder="Tên sản phẩm" name="tensanpham">
            </div>
            <div class="form-group">
                <input type="text" class="form-input" placeholder="số lượng" name="soluong">
            </div>
            <div class="form-group">
                <input type="text" class="form-input" placeholder="gia" name="gia">
            </div>
            <div class="form-group">
                <input type="file" class="form-input" placeholder="file ảnh" name="file" >
            </div>
            <div class="form-group">
                <input type="text" class="form-input" placeholder="mã loại" name="maloai">
            </div>
               <button type="submit" class="form-submit">Đăng ký</button>
            </div>
        </form>
    </div>
</body>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="style/js/app.js"></script>
</html>