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
        <th>courName:</th>
        <th>Year:</th>
        <th>company id:</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${courses}" var="com">
        <td>${com.courName}</td>
        <td>${com.year}</td>
        <td>${com.company.id}</td>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
