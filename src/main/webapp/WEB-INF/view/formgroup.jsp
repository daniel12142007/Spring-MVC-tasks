<%@ page import="org.springframework.web.bind.annotation.PostMapping" %>
<%@ page import="org.springframework.web.bind.annotation.RequestParam" %><%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 06.03.2023
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/save/group" method="post">
    <label>Name:</label><input type="text" name="name">
    <label>Start course:</label><input type="text" name="start">
    <label>Finish course:</label><input type="text" name="finish">
    <button>register</button>
</form>
</body>
</html>
