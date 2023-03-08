<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 08.03.2023
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/saveGroups" method="post">
    <label>Groups name</label><br><input type="text" name="groupName"><br>
    <label>dataStart</label><br><input type="text" name="dataStart"><br>
    <label>dataFinish</label><br><input type="text" name="dataFinish"><br>
    <c:forEach items="${all}" var="company">
        <input type="radio" id="${company.id}" name="id" value="${company.id}">
        <label for="${company.id}">${company.companyName}</label><br>
    </c:forEach>
    <input type="submit" value="register groups">
</form>
</body>
</html>