<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 06.03.2023
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="2px">
    <thead>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>age</th>
        <th>course.id</th>
    </tr>
    </thead>
    <c:forEach items="${student}" var="s">
        <tbody>
        <tr>
            <td>${s.id}</td>
            <td>${s.names}</td>
            <td>${s.age}</td>
            <td>${s.course.id}</td>
        </tr>
        </tbody>
    </c:forEach>
</table>
</body>
</html>
