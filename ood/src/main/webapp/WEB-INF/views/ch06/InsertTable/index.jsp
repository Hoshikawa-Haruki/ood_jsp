<%-- 
    Document   : index
    Created on : 2025. 5. 5., 오전 2:03:41
    Author     : Haruki
--%>

<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewprot" content="width=device-width, initial-scale=1.0">
    <title>주소록 추가</title>
</head>
<body>
    <h1>주소록 정보 입력</h1>
    <form action="${pageContext.request.contextPath}/jpa/addAddr" method="post">
        이름: <input type="text" name="name" required><br><br>
        이메일: <input type="email" name="email" required><br><br>
        전화번호: <input type="text" name="phone" required><br><br>
        <button type="submit">저장</button>
    </form>
</body>
</html>

