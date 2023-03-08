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
<h1>Company</h1>
<table border="2px">
    <thead>
    <th>Companies ID:</th>
    <th>Company:</th>
    </thead>
    <tbody>
    <c:forEach items="${company}" var="com">
        <tr>
            <td>${com.id}</td>
            <td>${com.companyName}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<button><a href="/companyForm">register Company</a></button>
<h1>Course</h1>
<table border="2px">
    <thead>
    <th>Courses ID:</th>
    <th>Courses:</th>
    <th>Company ID:</th>
    </thead>
    <tbody>
    <c:forEach items="${courses}" var="cour">
        <tr>
            <td>${cour.id}</td>
            <td>${cour.courName}</td>
            <td>${cour.company.id}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<button><a href="/courseForm">register Course</a></button>
<h1>Groups</h1>
<table border="2px">
    <thead>
    <th>Groups ID:</th>
    <th>Groups:</th>
    <th>Company ID:</th>
    </thead>
    <tbody>
    <c:forEach items="${groups}" var="groups">
        <tr>
            <td>${groups.id}</td>
            <td>${groups.groupName}</td>
            <td>${groups.company.id}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<button><a href="/groupsForm">register Groups</a></button>
<h1>Teacher</h1>
<table border="2px">
    <thead>
    <th>Teachers ID:</th>
    <th>Teachers:</th>
    <th>Course ID:</th>
    </thead>
    <tbody>
    <c:forEach items="${teachers}" var="teacher">
        <tr>
            <td>${teacher.id}</td>
            <td>${teacher.first_name}</td>
            <td>${teacher.course.id}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<button><a href="/teacherForm">register Teacher</a></button>
<h1>Student</h1>
<table border="2px">
    <thead>
    <th>Students ID:</th>
    <th>Students:</th>
    <th>Group ID:</th>
    </thead>
    <tbody>
    <c:forEach items="${student}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.first_name}</td>
            <td>${student.group.id}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<button><a href="">register Student</a></button>
<style>
    button {
        background: black;
    }

    a {
        color: white;
    }

    h1 {
        font-family: "Arial Black", serif;
    }
</style>
</body>
</html>