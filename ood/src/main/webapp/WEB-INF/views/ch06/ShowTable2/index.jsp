<%-- 
    Document   : index
    Created on : 2025. 5. 5., 오전 12:59:16
    Author     : Haruki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags/ch06" prefix="mytags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>주소록 보기 2</title>
    </head>
    <body>
        <h1>주소록</h1>
        <hr/>
    <c:catch var="errorReason">
        <mytags:addrbook user="jdbctester" password="12345"
                         schema="webmail" table="addrbook"/>
    </c:catch>
    ${empty errorReason ? "<noerror>" : errorReason} <!-- 오류 원인 출력 -->
    <br/>
    <a href="${pageContext.request.contextPath}/ch06/inserttable">주소록 추가</a>
</body>
</html>
