<%-- 
    Document   : index
    Created on : 2025. 3. 20., 오전 11:13:46
    Author     : 915-11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Beans 사용 예제</title>
    </head>
    <body>
        1부터 n까지의 합을 구하는 프로그램
        <form action="/BeansTest/show_sum.jsp" method = "POST"> <!-- 값을 POST방식으로 show_sum.jsp로 넘어가라.
                                                     javascript로 사용자 입력값에 대한 유효성 검사(클라이언트에서 처리, 트래픽도 덜 발생, 서버 부하 감소 -->
            n을 입력하세요 : <input type="text" name="n" value="" size="10"/> <br>
            <input type="submit" value="계산" /> 
            <input type="reset" value="초기화" />
        </form>
    </body>
</html>
