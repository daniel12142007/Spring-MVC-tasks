<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 08.03.2023
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="bg-image">
    <h1>Student</h1>
    <table border="2px">
        <thead>
        <th>Students ID:</th>
        <th>Students:</th>
        <th>last_name:</th>
        <th>email:</th>
        <th>studentforms:</th>
        <th>Group ID:</th>
        <th>delete:</th>
        <th>update:</th>
        </thead>
        <tbody>
        <c:forEach items="${student}" var="student">
            <tr>
                <td>${student.id}</td>
                <td>${student.first_name}</td>
                <td>${student.last_name}</td>
                <td>${student.email}</td>
                <td>${student.studentforms}</td>
                <td>${student.group.id}</td>
                <td>
                    <form action="/deleteStudent/${student.id}" method="get">
                        <button type="submit">delete</button>
                    </form>
                </td>
                <td>
                    <form action="/updateStudent/${student.id}" method="get">
                        <button type="submit">
                            <a href="/updateStudent/${student.id}">
                                update
                            </a>
                        </button>
                    </form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div style="display: flex; justify-content: center">
        <button class="button"><a class="a" href="/studentForm">register Student</a></button>
        <button class="button"><a class="a" href="/">back</a></button>
        <div>

        </div>
        <style>
            .bg {
                background-image: url("https://images.pexels.com/photos/753325/pexels-photo-753325.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
                width: 100%;
                background-size: cover;
                background-repeat: no-repeat;
                height: 700px;
            }

            td, th {
                border: 1px solid #ddd;
                padding: 8px;
                font-family: Arial, Helvetica, sans-serif;
                border-collapse: collapse;
            }

            * {
                padding: 0;
                margin: 0;
            }

            th {
                padding-top: 12px;
                padding-bottom: 12px;
                text-align: left;
                background-color: #04AA6D;
                color: white;
            }

            button {
                padding: 20px;
                margin: 10px;
                background: none;
            }

            a {
                color: white;
                text-decoration: none;
            }

            a:hover {
                color: red;
            }

            table {
                margin: 0 auto;
            }

            button {
                margin-left: 500px;
                margin: 4px auto;
                padding: 4px;
            }

            a {
                margin-left: 500px;
                margin: 2rem auto;
                padding: 2rem;

            }

            h1 {
                margin-left: 500px;
            }
        </style>
</body>
</html>