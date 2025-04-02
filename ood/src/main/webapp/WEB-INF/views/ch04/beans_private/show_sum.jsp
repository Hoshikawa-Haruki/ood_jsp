<%-- 
    Document   : show_sum
    Created on : 2025. 3. 20., 오전 11:18:39
    Author     : 915-11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="sum" scope="page" class="deu.se.ood.beans.ch04.SumBean" /> <!-- 여기서 실제로 인스턴스(객체)가 만들어짐 -->
<jsp:setProperty name="sum" property="n"/> <!-- index.jsp 에서 사용자가 입력한 값이 request.getParameter 통해서 값이 전달됨 -->
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Beans 사용 예제 </title>
    </head>
    <body>
        <% sum.calculate();%>
        계산결과 1 : <jsp:getProperty name="sum" property="result" /> <br><!-- comment -->
        계산결과 2 : <%= sum.getResult()%> <br><!-- comment -->
        계산결과 3 : ${sum.result}
    </body>
</html>
