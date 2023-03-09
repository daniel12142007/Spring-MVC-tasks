<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 07.03.2023
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="2px">
    <thead>
    <tr>
        <th>Company table</th>
        <th>Course table</th>
        <th>Group table</th>
        <th>Student table</th>
        <th>Teacher table</th>
    </thead>
    <tbody>
    <td>
        <button><a href="/table/company">Company table</a></button>
    </td>
    <td>
        <button><a href="/table/course">Course table</a></button>
    </td>
    <td>
        <button><a href="/table/group">Group table</a></button>
    </td>
    <td>
        <button><a href="/table/student">Student table</a></button>
    </td>
    <td>
        <button><a href="/table/teacher">Teacher table</a></button>
    </td>
    </tbody>
</table>
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
    table{
        margin: 0 auto;
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