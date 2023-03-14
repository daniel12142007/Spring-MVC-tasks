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
    <h1><a href="https://github.com/daniel12142007">GitHub</a></h1>
    <form action="/saveCourse" method="post">
        <label>Course name</label><br><input type="text" name="courName"><br>
        <label>Duration</label><br><input type="text" name="duration"><br>
        <h1 style="color:white;">Select Company</h1>
        <c:forEach items="${all}" var="company">
            <input type="radio" id="${company.id}" name="id" value="${company.id}">
            <label for="${company.id}">${company.companyName}</label><br>
        </c:forEach>
        <input type="submit" value="register course">
    </form>
<style>
    body {
        width: 100%;
        background-size: cover;
        background-repeat: no-repeat;
        height: 700px;
        background-image: url("https://i.pinimg.com/originals/8a/f0/0a/8af00a893dfed093bff38b945766282a.png");
    }

    form {
        width: 70%;
        max-width: 30rem;
        box-shadow: 0 3px 10px rgb(0 0 0 / 0.2);
        border-radius: 3px;
        display: flex;
        margin: 0 auto;
        flex-direction: column;
        color: none;
    }

    form label {
        font-weight: bold;
        flex: 1;
        margin-top: 10px;
        color: white;
    }

    form input {
        box-shadow: 4px 4px 10px rgba(0, 0, 0, 0.06);
        flex: 3;
        padding: 0.35rem 0.35rem;
        border-radius: 6px;
        border: 1px solid #ccc;
    }

    button {
        margin-top: 20px;
        background-color: black;
        color: none;
    }
</style>
</body>
</html>