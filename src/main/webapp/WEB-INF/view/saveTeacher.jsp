<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 08.03.2023
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/saveTeacher" method="post">
    <label>Teacher name</label><br><input type="text" name="first_name"><br>
    <label>Teacher last_name</label><br><input type="text" name="last_name"><br>
    <label>email</label><br><input type="text" name="email"><br>
    <c:forEach items="${all}" var="courses">
        <input type="radio" id="${courses.id}" name="id" value="${courses.id}">
        <label for="${courses.id}">${courses.courName}</label><br>
    </c:forEach>
    <input type="submit" value="register group">
</form>
<style>
    input{
        background-color: white;
        color: black;
        border: 2px solid #555555;
    }
    input:hover {
        background-color: #555555;
        color: white;
    }
</style>
<style>
    input{
        background-color: white;
        color: black;
        border: 2px solid #555555;
    }
    input:hover {
        background-color: #555555;
        color: white;
    }
</style>
</body>
</html>