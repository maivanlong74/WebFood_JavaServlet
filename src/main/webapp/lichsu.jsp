<%@page import="bean.khachhangbean"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="dao.lichsudao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="bean.lichsubean"%>
<%@page import="bean.giohangbean"%>
<%@page import="bo.giohangbo"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.loaibean"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Lịch sử</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <link rel="stylesheet" href="style/css/style.css">
    <link rel="stylesheet" href="style/css/lichsu.css">
</head>
<body>
    <div id="wrapper">
        <jsp:include page="include/head.jsp"></jsp:include>
        <a href="sanpham"><img alt="" src="style/chucnang/Quaylai.jpg" style="margin-top: -21px; display: block;"></a>
        <div class="head-two">
            <form action="sanpham" id="search-box">
                <input type="text" id="search-text" placeholder="Tìm sản phẩm" required>
                <button id="search-btn"><i class="fa-solid fa-magnifying-glass"></i></button>
            </form>
        </div>
        
        <div class="giohang">
            <a href="trangchu" class="huyhang">❌</a>
            <h1 style="color: white;margin-top: -3px;margin-left: 509px;">
                LỊCH SỬ MUA HÀNG
            </h1>
            <form action="" method="post">
                <div class="sanpham">
                    <table  border="1" class="table table-light" 
                            style="background: none; width: 800;">
                        <thead>
                            <tr>
                                <th scope="col">Mã khách hàng</th>
                                <th scope="col">Họ tên</th>
                                <th scope="col">Mã hóa đơn</th>
                                <th scope="col">Ngày mua</th>
                                <th scope="col">Tổng tiền</th>
                                <th scope="col">Trạng thái</th>
                            </tr>
                        </thead>
                    
                        <tbody>
                        <%if(session.getAttribute("kh")!=null){ 
                            ArrayList<lichsubean> ls=(ArrayList<lichsubean>)request.getAttribute("ls");
							int n = ls.size();
							for(int i=0;i<n;i++){
					        	 lichsubean s=ls.get(i);
						%>
                                <tr>
                                    <td><%=s.getMakh()%></td>
                                    <td><%=s.getHoten()%></td>
                                    <td><a href="" style="color: white;";><%=s.getMaHoaDon()%></a></td>
                                    <td><%=s.getNgaymua()%></td>
                                    <td><%=s.getThanhtien()%>.VND</td>
                                    <td><%=s.isDamua()%></td>
                                </tr>
                                
                          <%}} else{%>
                          		<h1>Bạn cần phải đăng nhập</h1>
                          <%} %>
                        </tbody>
                    </table>
                </div>
            </form>
        </div>

        <jsp:include page="include/footer.jsp"></jsp:include>
    </div>
    <script src="style/js/script.js"></script>
</body>
</html>
