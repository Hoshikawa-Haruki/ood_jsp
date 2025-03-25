<%-- 
    Document   : footer
    Created on : 2025. 3. 26., 오전 2:49:22
    Author     : Haruki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>include2 footer.jsp</title>
    </head>
    <body>
        <hr>
        페이지 하단에 들어갈 내용입니다.
        <br> include2 footer.jsp
        <!--jsp:include 라서 런타임 시점에 include, 소스보기에서 html 태그가 보임-->
        <br>
        날짜: <%= request.getParameter("date") %>
        <br>
        사용자: <%= request.getParameter("user") %>
        <hr>
    </body>
</html>
