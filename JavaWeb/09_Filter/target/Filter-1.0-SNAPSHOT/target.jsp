<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        System.out.println("target当前线程：" + Thread.currentThread().getName());
        System.out.println("目标代码");
    %>
</body>
</html>
