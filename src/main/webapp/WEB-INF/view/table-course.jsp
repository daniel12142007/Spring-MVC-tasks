<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 08.03.2023
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Course</h1>
<table border="2px">
    <thead>
    <th>Courses ID:</th>
    <th>Courses:</th>
    <th>duration:</th>
    <th>Company ID:</th>
    <th>delete:</th>
    <th>update:</th>
    </thead>
    <tbody>
    <c:forEach items="${courses}" var="cour">
        <tr>
            <td>${cour.id}</td>
            <td>${cour.courName}</td>
            <td>${cour.duration}</td>
            <td>${cour.company.id}</td>
            <td>
                <form action="/deleteCourse/${cour.id}" method="get">
                    <button type="submit">delete</button>
                </form>
            </td>
            <td>
                <form action="updateCourse/${cour.id}" method="get">
                    <button type="submit"><a href="/updateCourse/${cour.id}">update</a></button>
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<button><a href="/courseForm">register Course</a></button>
<button><a href="/">back</a></button>
<style>
    td, th {
        border: 1px solid #ddd;
        padding: 8px;
        font-family: Arial, Helvetica, sans-serif;
        border-collapse: collapse;
    }

    tr:hover {
        background-color: #ddd;
    }

    th {
        padding-top: 12px;
        padding-bottom: 12px;
        text-align: left;
        background-color: #04AA6D;
        color: white;
    }

    button {
        background-color: white;
        color: black;
        border: 2px solid #555555;
    }

    a {
        color: black;
    }

    a:hover {
        background-color: #555555;
        color: white;
    }

    button:hover {
        background-color: #555555;
        color: white;
    }
    button{
        margin-left: 500px;
        margin: 4px auto;
        padding: 4px;
    }
    a{
        margin-left: 500px;
        margin: 2rem auto;
        padding: 2rem;

    }
    h1{
        margin-left: 500px;
    }
</style>
</body>
</html>