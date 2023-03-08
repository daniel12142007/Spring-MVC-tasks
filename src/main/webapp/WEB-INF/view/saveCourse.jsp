<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 08.03.2023
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/saveCourse" method="post">
    <label>Course name</label><br><input type="text" name="courName"><br>
    <label>Duration</label><br><input type="text" name="duration"><br>
    <c:forEach items="${all}" var="company">
        <input type="radio" id="${company.id}" name="id" value="${company.id}">
        <label for="${company.id}">${company.companyName}</label><br>
    </c:forEach>
    <input type="submit" value="register course">
</form>
</body>
</html>