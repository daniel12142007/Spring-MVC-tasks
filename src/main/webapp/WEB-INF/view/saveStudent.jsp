<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 08.03.2023
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/saveStudent" method="post">
    <label>name</label><br><input type="text" name="first_name"><br>
    <label>last_name</label><br><input type="text" name="last_name"><br>
    <label>email</label><br><input type="text" name="email"><br>
    <label>format</label><br><input type="text" name="format"><br>
    <c:forEach items="${all}" var="group">
        <input type="radio" id="${group.id}" name="id" value="${group.id}">
        <label for="${group.id}">${group.groupName}</label><br>
    </c:forEach>
    <input type="submit" value="register student">
</form>
</body>
</html>
