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
		<form action="ktdk" class=login enctype= "multipart/form-data" method="post">
            <!-- <input type="file" class="txtfile" placeholder="File ảnh" name="txtfile" style="color: #fff;margin-top: 47px;"> -->
            <h1 class="heard">Đăng ký</h1>
            <div class="form-group">
                <input type="text" class="form-input" placeholder="Họ và tên" name="HOTENKH">
            </div>
            <div class="form-group">
                <input type="text" class="form-input" placeholder="Số điện thoại" name="SODIENTHOAI">
            </div>
            <div class="form-group">
                <input type="text" class="form-input" placeholder="Địa chỉ" name="DIACHI">
            </div>
            <div class="form-group">
                <input type="file" class="form-input" placeholder="Địa chỉ" name="File ảnh" name="txtfile">
            </div>
            <div class="form-group">
                <input type="text" class="form-input" placeholder="Số tài khoản" name="THENH">
            </div>
            <div class="form-group">
                <input type="text" class="form-input" placeholder="Tên ngân hàng" name="TENNH">
            </div>
            <div class="form-group">
                <input type="text" class="form-input" placeholder="Tên đăng nhập" name="TENDANGNHAP">
            </div>
            <div class="form-group">
                <input type="password" class="form-input" placeholder="Mật khẩu" name="MATKHAU">
            </div>
            <div class="form-group">
         
         	<input type="password" class="form-input" placeholder="Gõ lại mật khẩu" name="GOLAIMK">
            </div>
            <button type="submit" class="form-submit">Đăng ký</button>
            </div>
        </form>
    </div>
</body>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="style/js/app.js"></script>
</html>