<%@page import="bean.khachhangbean"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<div id="header">
            <a href="dangnhapadmin" class="logo">
                <img src="style/assets//logo.jpg" alt="" width="75px">
            </a>
            <div id="menu">
                <div class="item">
                    <a href="trangchu">Trang chủ</a>
                </div>
                <div class="item">
                    <a href="sanpham">Sản phẩm</a>
                </div>
                <div class="item">
                    <a href="blog">Blog</a>
                </div>
                <div class="item">
                    <a href="htphanhoi">Liên hệ</a>
                </div>
            </div>
            <div id="actions">
            <%if(session.getAttribute("kh")==null){ %>
                <a class="item" href="dangnhap">
                    <img src="style/assets/user.png" alt="">
                </a>
            <%}else{ %>
            	<a href="trangcanhan" class="item"> Hello: <%khachhangbean ten =(khachhangbean)session.getAttribute("kh");
						        out.print(ten.getHoten());
						        %>
				    </a> 
	    		<a href="dangxuat" class="item"><img src="style/assets/logout.png" alt=""></a>
    		<%}%>    	
                <a class="item" href="dangky">
                    <img src="style/assets/icondangky.jpg" alt="">
                </a>
                <a class="item" href="htgio">
                    <img src="style/assets/cart.png" alt=""> (<%=session.getAttribute("i")%>)
                </a>
                <%if(session.getAttribute("kh") == null){%>
		        		<a class="item">
		                    <img src="style/chucnang/lichsu.jpg" alt="">
		                </a>		
		        <%} else{%>
		        	<a class="item" href="lichsu">
	                    <img src="style/chucnang/lichsu.jpg" alt="">
	                </a>
	             <%} %>
            </div>
        </div>