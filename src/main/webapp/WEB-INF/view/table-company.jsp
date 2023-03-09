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
                <form action="/deletebyCompany/${com.id}" method="get">
                    <button type="submit"><a>
                        delete
                    </a>
                    </button>
                </form>
            </td>
            <td>
                <form action="updateCompany/${com.id}" method="get">
                    <button type="submit"><a href="/updateCompany/${com.id}">update</a></button>
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<button><a href="/companyForm">register Company</a></button>
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