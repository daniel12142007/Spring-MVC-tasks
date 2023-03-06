<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 06.03.2023
  Time: 16:22
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
        <th>id:</th>
        <th>first_name:</th>
        <th>last_name:</th>
        <th>email:</th>
        <th>studentFormat:</th>
        <th>group id:</th>
    </tr>
    </thead>
    <c:forEach items="${student}" var="com">
        <tbody>
        <td>${com.id}</td>
        <td>${com.first_name}</td>
        <td>${com.last_name}</td>
        <td>${com.email}</td>
        <td>${com.studentFormat}</td>
        <td>${com.group.id}</td>
        </tbody>
    </c:forEach>
</table>
</body>
</html>