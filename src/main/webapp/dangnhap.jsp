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
        <form action="ktdn" method="post" class="login">
            <h1 class="heard">Đăng nhập</h1>
            <div class="form-group">
                <input type="text" class="form-input" placeholder="Tên đăng nhập" name="txtun">
            </div>
            <div class="form-group">
                <input type="password" class="form-input" placeholder="Mật khẩu" name="txtpass">
            </div>
            <button type="submit" class="form-submit" name="but1">Đăng Nhập</button>
            <%if(request.getParameter("kt")!=null){%>
    		  <script>
		    	  	alert('Bạn đăng nhập sai rồi, đăng nhập lại đi')
	    	  	</script>");
		      <%} %>
        </form>
    </div>
</body>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="style/js/app.js"></script>
</html>