<%-- 
    Document   : index
    Created on : 2025. 4. 3., 오전 8:30:30
    Author     : Haruki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>EL 표현식 묵시적 객체 사용 예제</title>
    </head>
    <body>
        <ul>
            <li>웹 브라우저 : ${header["user-agent"]}</li>
            <li>사용자 컴퓨터 : ${header.host}</li>
            <li>HTTP 메소드 : ${pageContext.request.method}</li>
            <li>name 매개변수 : ${empty param["name"] ? "없음" : param.name}</li>
            <li>세션 ID : ${cookie["JSESSIONID"].value}</li>
        </ul>
    </body>
</html>
