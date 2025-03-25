<%-- 
    Document   : index
    Created on : 2025. 3. 26., 오전 2:08:03
    Author     : Haruki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP 6.3.7 Scripting Elements</title>
    </head>
    <body>
        <%!
            String userName = "김갈치";
            int age = 20;
        %>
        
        <%
            age +=5; // 새로고침 시 마다 값 누적 증가. 
        %>
        
        이름 : <%= userName %>
        <br>
        나이 : <%= age %>
    </body>
</html>
