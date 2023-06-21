<%@page import="bean.giohangbean"%>
<%@page import="bo.giohangbo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sản phẩm</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <link rel="stylesheet" href="style/css/style.css">
    <link rel="stylesheet" href="style/css/giohang.css">
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
            <form action="suaxoa" method="post">
            	<button name="huyhang" type="submit" class="huyhang">❌</button>
                <div class="sanpham">
                <%
				   giohangbo gh=(giohangbo)session.getAttribute("gio");
				   String x=request.getParameter("sl");
				   if(gh!=null){ %>
                    <table>
                        <tr>
                            <td></td>
                            <td>MÃ SẢN PHẨM</td>
                            <td>ẢNH</td>
                            <td>TÊN SẢN PHẨM</td>
                            <td>GIÁ SÁCH</td>
                            <td>SỐ LƯỢNG</td>
                            <td>THÀNH TIỀN</td>
                        </tr>
							  <% for(giohangbean h: gh.ds){%>
                        <tr>
                            <td><input type="checkbox" name="check"
								value="<%=h.getMasanpham()%>"></td>
                            <td><%=h.getMasanpham()%></td>
                            <td><img src="style/sanpham/<%=h.getAnh()%>" alt="" style="max-width: 220px;max-height: 140px;"></td>
                            <td><%=h.getTensanpham()%></td>
                            <td><%=h.getGia()%>.VND</td>
                            <td><input type="number" value="<%=h.getSoluong()%>" min="1" name="<%=h.getMasanpham()%>" 
                                        style="background: none;
                                        border: 1px solid white;
                                        color: white;
                                        width: 45px;
                                        text-align: center;">
                                    <button value="<%=h.getMasanpham()%>" name="butsua" type="submit">save</button>
                            </td>
                            <td><%=h.getThanhtien()%>.VND</td>
                            <td>
                            	<button name="butxoa" type="submit" value="<%=h.getMasanpham()%>">Delete</button>
                           	</td>
                        </tr>
                        <%}%>
                    </table>

                </div>
                <div class="top">
                    <button name="xoachon" class="xoachon"><img src="style/chucnang/xoa.jpg" alt="" width="30px"></button>
                    <p>Tổng tiền: <%out.print(gh.Tongtien());%>.VND</p>
                </div>
            </form>
            <form action="tinhtien" method="post">
                <button name="but1" class="thanhtoan">
                    <img src="style/chucnang/thanhtoan.jpg" alt="Thanh toán">
                </button>
            </form>
            <%}else{%>
            	<div class="sanpham">
                    <h1 style="color: white;margin-top: 205px;margin-left: 300px;">
                        HIỆN KHÔNG CÓ SẢN PHẨM TRONG GIỎ HÀNG
                    </h1>
                </div>
            <%} %>
        </div>

        <jsp:include page="include/footer.jsp"></jsp:include>
    </div>
    <script src="style/js/script.js"></script>
</body>
</html>