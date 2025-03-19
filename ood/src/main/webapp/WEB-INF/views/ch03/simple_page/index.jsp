<%-- 
    Document   : index
    Created on : 2025. 3. 19., 오전 10:38:00
    Author     : Haruki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.time.LocalDateTime" %>
<%@page import="java.time.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>지시어 사용방법</title>
    </head>
    <body>
        현재 시각은 <%= LocalDateTime.now().toString() %> <!-- 스크립틀릿 표현식 --> 입니다. <br>
        현재 시각은 <%= ZonedDateTime.now().toString() %> 입니다.
        
        <%@include file="/WEB-INF/jspf/main_footer.jspf"%>
    </body>
</html>
