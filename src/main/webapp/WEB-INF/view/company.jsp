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
        <th>companyName:</th>
        <th>Country:</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${company}" var="com">
        <td>${com.companyName}</td>
        <td>${com.country}</td>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
