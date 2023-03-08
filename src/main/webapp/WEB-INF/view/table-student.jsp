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
                    <button type="submit">update</button>
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<button><a href="/studentForm">register Student</a></button>
</body>
</html>
