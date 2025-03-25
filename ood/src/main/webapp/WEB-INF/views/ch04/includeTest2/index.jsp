<%-- 
    Document   : newjsp
    Created on : 2025. 3. 26., 오전 2:49:11
    Author     : Haruki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>&lt:jsp:include2&gt; 액션 예제</title>
    </head>
    <body>
        <jsp:include page = "header.jsp"/>
        includeTest2 본문 내용입니다.
        <% request.setCharacterEncoding("UTF-8"); %>
        <jsp:include page = "footer.jsp">
            <jsp:param name = "date" value = "<%= new java.util.Date() %>"/>
            <jsp:param name = "user" value = "김갈치"/>
        </jsp:include>
    </body>
</html>
