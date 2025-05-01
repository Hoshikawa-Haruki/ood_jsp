<%-- 
    Document   : index
    Created on : 2025. 5. 1., 오후 3:17:09
    Author     : Haruki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>파일 업로드 페이지</title>
        <script type='text/javascript'>
            function check_file_size() {
                var size_limit = 20 * 1000 * 1000; // 20 MB
                var file = document.getElementById('file_input').files[0];
                alert('Upload file name = ' + file.name + ", file size = " +
                        file.size.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",") + "바이트");
                if (file.size > size_limit) {
                    alert('Cannot upload the file because of FILE SIZE > 20MB');
                    return false;
                } else {
                    return true;
                }
            }
        </script>

    </head>
    <body>
        <c:if test="${not empty msg}">
            <script>
        alert("${msg}");
            </script>
        </c:if>
            
        <form enctype="multipart/form-data" method="POST" action="<%= request.getContextPath()%>/ch07/FileUpload2/upload2.do" onsubmit="return check_file_size()">
            username : <input type="text" name="username"> <br>
            upload할 파일 선택 : <input type="file" name="file_input" id="file_input"> <br>
            <input type="submit" value="Upload">
        </form>
    </body>
</html>
