<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 08.03.2023
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Company</h1>
<table border="2px">
    <thead>
    <th>Companies ID:</th>
    <th>Company:</th>
    <th>locatedCountry:</th>
    <th>delete:</th>
    <th>update:</th>
    </thead>
    <tbody>
    <c:forEach items="${company}" var="com">
        <tr>
            <td>${com.id}</td>
            <td>${com.companyName}</td>
            <td>${com.locatedCountry}</td>
            <td>
                <form action="/deleteCompany/${com.id}" method="get">
                    <button type="submit">delete</button>
                </form>
            </td>
            <td>
                <form action="updateCompany/${com.id}" method="get">
                    <button type="submit">update</button>
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<button><a href="/companyForm">register Company</a></button>
<style>
    h1 {
        font-family: "Arial Black", serif;
    }
</style>
</body>
</html>
