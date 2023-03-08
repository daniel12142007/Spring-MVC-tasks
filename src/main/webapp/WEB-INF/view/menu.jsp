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
</body>
</html>