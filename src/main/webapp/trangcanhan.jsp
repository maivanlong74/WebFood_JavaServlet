<%@page import="bean.htkhachhangbean"%>
<%@page import="bean.khachhangbean"%>
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
    <link rel="stylesheet" href="style/css/trangcanhan.css">
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
        <%
            ArrayList<htkhachhangbean> khachhang=(ArrayList<htkhachhangbean>)request.getAttribute("khachhang");
			int n = khachhang.size();
			for(int i=0;i<n;i++){
				htkhachhangbean s=khachhang.get(i);
		%>
            <div class="avt">
                <img src="<%=s.getTen_anh()%>" alt="">
            </div>
            <div class="thongtin">
                <h3><%=s.getHoten()%></h3>
                <h3>Số điện thoại: <%=s.getSodt()%></h3>
                <h3>Địa chỉ: <%=s.getDiachi()%></h3>
                <h3>Thẻ ngân hàng: <%=s.getTennganhang()%></h3>
                <h3>Tên ngân hàng: <%=s.getTennganhang()%></h3>
                <h3>Tên đăng nhập: <%=s.getTendn()%></h3>
                <h3>Mật khẩu: <%=s.getPass()%></h3>
            </div>
            <%}%>
        </div>
	<jsp:include page="include/footer.jsp"></jsp:include>
    </div>
    <script src="style/js/script.js"></script>
</body>
</html>