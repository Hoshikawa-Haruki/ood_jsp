<%-- 
    Document   : index.jsp
    Created on : 2025. 4. 1., 오후 1:11:50
    Author     : Haruki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewprot" content="width=device-width, initial-scale=1.0">
        <title>표현식 언어 예제</title>
    </head>
    <body>
        <jsp:useBean id="userBean" scope="page"
                     class="deu.se.ood.beans.ch05.UserInfo" />
        <jsp:setProperty name="userBean" property="name" value="김갈치" />
        <jsp:setProperty name="userBean" property="age" value="25" />

        사용자 이름: ${userBean.name} <br/>
        나이: ${userBean["age"]} <br/>
        10년 뒤 나이: ${userBean.age+10}

    </body>
</html>
