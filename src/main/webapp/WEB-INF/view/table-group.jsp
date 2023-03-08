<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 08.03.2023
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Groups</h1>
<table border="2px">
    <thead>
    <th>Groups ID:</th>
    <th>Groups:</th>
    <th>dataStart:</th>
    <th>dataFinish:</th>
    <th>Company ID:</th>
    <th>delete:</th>
    <th>update:</th>
    </thead>
    <tbody>
    <c:forEach items="${groups}" var="group">
        <tr>
            <td>${group.id}</td>
            <td>${group.groupName}</td>
            <td>${group.dataStart}</td>
            <td>${group.dataFinish}</td>
            <td>${group.company.id}</td>
            <td>
                <form action="/deleteGroup/${group.id}" method="get">
                    <button type="submit">delete</button>
                </form>
            </td>
            <td>
                <form action="/updateGroup/${group.id}" method="get">
                    <button type="submit">update</button>
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<button><a href="/groupsForm">register Groups</a></button>
<button><a href="/">back</a></button>
</body>
</html>