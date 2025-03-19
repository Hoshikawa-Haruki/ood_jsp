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
        <h1>나는야 본문맨!</h1>
        <%@include file="/WEB-INF/jspf/footer.jspf"%>
    </body>
</html>
