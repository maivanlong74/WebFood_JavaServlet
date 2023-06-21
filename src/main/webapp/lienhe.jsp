<%@page import="bean.htphanhoibean"%>
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
    <link rel="stylesheet" href="style/css/style.css">
</head>
<body>
	<div id="wrapper">
        <jsp:include page="include/head.jsp"></jsp:include>

        <div id="comment">
            <h2>NHẬN XÉT CỦA KHÁCH HÀNG</h2>
            <div id="comment-body">
                <div class="prev">
                    <a href="#">
                        <img src="style/assets/prev.png" alt="">
                    </a>
                </div>
                <ul id="list-comment">
                <%ArrayList<htphanhoibean> listphanhoi = (ArrayList<htphanhoibean>)request.getAttribute("listphanhoi");
  			       int n= listphanhoi.size();
  			       for(int i=0;i<n;i++){
  			        	 htphanhoibean s=listphanhoi.get(i);
                %>
                    <li class="item">
                        <div class="avatar">
                            <img src="<%=s.getTen_anh()%>" alt="" style="  width: 97px;
																		    border-radius: 26%;
																		    border: 3px solid white;">

                        </div>
                        <div class="stars">
                            <span>
                                <img src="style/assets/star.png" alt="">
                            </span>
                            <span>
                                <img src="style/assets/star.png" alt="">
                            </span>
                            <span>
                                <img src="style/assets/star.png" alt="">
                            </span>
                            <span>
                                <img src="style/assets/star.png" alt="">
                            </span>
                            <span>
                                <img src="style/assets/star.png" alt="">
                            </span>
                        </div>
                        <div class="name"><%=s.getHoten()%></div>

                        <div class="text">
                            <p style="text-align: center;"><%=s.getNoidung()%></p>
                        </div>
                    </li>
                    <%}%>
                </ul>
                <div class="next">
                    <a href="#">
                        <img src="style/assets/next.png" alt="">
                    </a>
                </div>
            </div>
        </div>
	<jsp:include page="include/footer.jsp"></jsp:include>
    </div>
    <script src="style/js/script.js"></script>
</body>
</html>