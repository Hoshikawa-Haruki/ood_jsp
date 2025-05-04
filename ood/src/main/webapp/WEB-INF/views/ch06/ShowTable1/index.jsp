<%-- 
    Document   : index
    Created on : 2025. 5. 4., 오후 7:45:57
    Author     : Haruki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>주소록 보기 1</title>
    </head>
    <body>
        <h1>주소록</h1>
        <hr/>

        <%
            final String JdbcDriver = "com.mysql.cj.jdbc.Driver";
            final String JdbcUrl = "jdbc:mysql://localhost:3306/webmail?serverTimezone=Asia/Seoul";
            // 로컬에서 실행 중인 MySQL 서버의 3306 포트에 있는 webmail 데이터베이스에 접속
            final String User = "jdbctester";
            final String Password = "12345";
            try {
                // 1. JDBC 드라이버 적재
                Class.forName(JdbcDriver);
                // 2. Connection 객체 생성
                Connection conn = DriverManager.getConnection(JdbcUrl, User, Password);
                // 3. Statement 객체 생성
                Statement stmt = conn.createStatement();
                // 4. SQL 질의 실행
                String sql = "select email, name, phone from addrbook";
                ResultSet rs = stmt.executeQuery(sql);

        %>

        <table border="1">
            <thead>
                <tr>
                    <th>이름</th>
                    <th>이메일</th>
                    <th>전화번호</th>
                </tr>
            </thead>
            <tbody>
                <%                    // 테이블 몸체
                    while (rs.next()) {
                        out.println("<tr>");
                        out.println("<td>" + rs.getString("name") + "</td>");
                        out.println("<td>" + rs.getString("email") + "</td>");
                        out.println("<td>" + rs.getString("phone") + "</td>");
                        out.println("</tr>");
                    }
                    // 자원 해제
                    rs.close();
                    stmt.close();
                    conn.close();
                %>
            </tbody>
        </table>
        <%
            } catch (Exception ex) {
                out.println("오류가 발생했습니다. (발생 오류 : "
                        + ex.getMessage() + ")");
            }
        %>
    </body>
</html>
