<%-- 
    Document   : index
    Created on : 2025. 3. 26., 오전 1:23:15
    Author     : Haruki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% request.setCharacterEncoding("UTF-8"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>&lt;jsp:forward&gt; 액션 예제</title>
    </head>
    <body>
        <% String user = request.getParameter("user");
        if(user == null || user.equals("")) {
        %>
        사용자가 지정되지 않았습니다. 사용자의 이름을 입력해 주시기 바랍니다.
        <form method="POST"> <!-- action 이 생략되면, 자기 자신을 호출 -->
            이름: <input type=""text" name="user" value=""/>
            <input type="submit" value="입력"/>
        </form>
        <% } else {%>
        <jsp:forward page="process.jsp"/>
        <% } %>
    </body>
</html>

