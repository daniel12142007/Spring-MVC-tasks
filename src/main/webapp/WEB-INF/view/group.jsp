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
        <th>start:</th>
        <th>finish:</th>
        <th>company id:</th>
        <th>course id:</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${group}" var="com">
        <td>${com.id}</td>
        <td>${com.start}</td>
        <td>${com.finish}</td>
        <td>${com.company.id}</td>
        <c:forEach items="${com.course}" var="s">
            <td>${s.id}</td>
        </c:forEach>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
