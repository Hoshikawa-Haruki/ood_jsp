<%-- 
    Document   : index2
    Created on : 2025. 3. 20., 오전 6:45:50
    Author     : Haruki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="show_error.jsp"%> <!--페이지 지시어 사용-->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>지시어의 오류 관련 속성 미사용 예제</title>
    </head>
    <body>
        <%= 5 / 0%>
        <%@include file="/WEB-INF/jspf/main_footer.jspf"%>
    </body>
</html>
