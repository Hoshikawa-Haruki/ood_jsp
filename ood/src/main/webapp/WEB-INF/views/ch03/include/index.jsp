<%-- 
    Document   : index.jsp
    Created on : 2025. 3. 19., 오전 10:38:29
    Author     : Haruki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>3장 Include Test 프로젝트 </title>
    </head>
    <body>
        <%@include file="/WEB-INF/jspf/header.jspf"%>
        <h2> @include로 include 하기(컴파일 시점)</h2>
        <%@include file="/WEB-INF/jspf/footer.jspf"%>
        <%@include file="/WEB-INF/jspf/main_footer.jspf"%>
    </body>
</html>
