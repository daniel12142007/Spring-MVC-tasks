<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 13.03.2023
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <table>
        <td>
            <caption>Company</caption>
            <table border="2px">
                <th>company ID</th>
                <th>company name</th>
                <tr>
                    <td>${co.id}</td>
                    <td>${co.companyName}</td>
                </tr>
            </table>
        </td>
        <td>
            <h2>Course</h2>
            <table border="2px">
                <th>Course ID</th>
                <th>Course Name</th>
                <c:forEach items="${comi}" var="comi">
                    <tr>
                        <td>${comi.id}</td>
                        <td>${comi.courName}</td>
                    </tr>
                </c:forEach>
            </table>
        </td>
        <td>
            <h2>Groups</h2>
            <table border="2px">
                <th>Groups ID</th>
                <th>Groups Name</th>
                <c:forEach items="${com}" var="com">
                    <tr>
                        <td>${com.id}</td>
                        <td>${com.groupName}</td>
                    </tr>
                </c:forEach>
            </table>
        </td>
        <td>
            <h2>Teacher</h2>
            <table border="2px">
                <th>Teacher ID</th>
                <th>Teacher Name</th>
                <th>Course ID(Teacher)</th>
                <c:forEach items="${comina}" var="comina">
                    <tr>
                        <td>${comina.id}</td>
                        <td>${comina.first_name}</td>
                        <td>${comina.course.id}</td>
                    </tr>
                </c:forEach>
            </table>
        </td>
        <td>
            <h2>Student</h2>
            <table border="2px">
                <th>Student ID</th>
                <th>Student Name</th>
                <th>Group ID(Student)</th>
                <c:forEach items="${comin}" var="comin">
                    <tr>
                        <td>${comin.id}</td>
                        <td>${comin.first_name}</td>
                        <td>${comin.group.id}</td>
                    </tr>
                </c:forEach>
            </table>
        </td>
    </table>
</div>
<style>
    table {
        border-collapse: collapse;
        width: 60%;
        font-family: Arial, sans-serif;
        font-size: 14px;
    }
    body {
        background-image: url("https://i.pinimg.com/originals/86/33/d6/8633d62b06962ff5b83fce01c15c6170.jpg");
        width: 100%;
        background-size: cover;
        background-repeat: no-repeat;
        height: 700px;
    }

    th, td {
        border: 1px solid #ddd;
        padding: 8px;
        text-align: left;
        color: whitesmoke;

    }

    th {
        background-color: none;
        font-weight: bold;
    }

    tr:nth-child(even) {
        background-color: none;
    }

    caption {
        color: white;
        font-size: 16px;
        font-weight: bold;
        margin-bottom: 10px;
    }
    h2{
        color: white;
        font-size: 16px;
        font-weight: bold;
        margin-bottom: 10px;
    }
</style>
</body>
</html>