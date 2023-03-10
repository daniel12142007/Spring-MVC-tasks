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
            * {
                padding: 0;
                margin: 0;
            }

            .bg-image {
                background-image: url("https://wallpapers-fenix.eu/full/180331/101017562.jpg");
                width: 100%;
                background-size: cover;
                background-repeat: no-repeat;
                height: 700px;
            }

            table {
                width: 70%;
                max-width: 30rem;
                margin: 0 auto;
                box-shadow: 0 3px 10px rgb(0 0 0 / 0.2);
                border-radius: 3px;

            }

            .button {
                padding: 20px;
                margin: 10px;
                background: none;
            }

            .a {
                color: white;
                text-decoration: none;
            }

            .a:hover {
                color: red;
            }

            button {
                background: none;
            }

            th {
                color: white;
            }

            td {
                color: white;
            }

            a {
                color: white;
            }

            button {
                color: white;
            }
        </style>
</body>
</html>