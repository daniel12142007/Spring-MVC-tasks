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
<div class="bg">
    <h1><a href="https://github.com/daniel12142007">GitHub</a></h1>
    <form action="/saveGroups" method="post">
        <label>Groups name</label><br>
        <input type="text" name="groupName"><br>
        <label>dataStart</label><br>
        <input type="text" name="dataStart"><br>
        <label>dataFinish</label><br>
        <input type="text" name="dataFinish"><br>
        <h1>Select Company</h1>
        <c:forEach items="${all}" var="company">
            <input type="radio" id="${company.id}" name="id" value="${company.id}">
            <label for="${company.id}">${company.companyName}</label><br>
        </c:forEach>
        <h1>Select Course</h1>
        <c:forEach items="${course}" var="idCourse">
            <input type="radio" id="${idCourse.id}" name="idCourse" value="${idCourse.id}">
            <label for="${idCourse.id}">${idCourse.courName}</label><br>
        </c:forEach>
        <input type="submit" value="register group">
    </form>
</div>
<style>
    body {
        margin: 0;
    }

    .bg {
        /*background-image: url("https://i.pinimg.com/originals/d8/e5/4a/d8e54ab355257c4351f9f72baa521bf1.jpg");*/
        background: chartreuse;
        width: 100%;
        background-size: cover;
        /*background-repeat: no-repeat;*/
        height: 1000px;
    }

    form {
        width: 70%;
        max-width: 30rem;
        box-shadow: 0 3px 10px rgb(0 0 0 / 0.2);
        border-radius: 3px;
        display: flex;
        margin: 0 auto;
        flex-direction: column;
    }

    form label {
        font-weight: bold;
        flex: 1;
        color: rgb(0, 0, 0);
        margin-bottom: 0.5rem;
        margin-top: 10px;
        color: white;
    }

    form input {
        box-shadow: 4px 4px 10px rgba(0, 0, 0, 0.06);
        flex: 3;
        font-weight: bold;
        font: inherit;
        padding: 0.35rem 0.35rem;
        border-radius: 6px;
        border: 1px solid #ccc;
    }

    button {
        margin-top: 20px;
        background-color: black;
        color: white;
    }
</style>
</body>
</html>
