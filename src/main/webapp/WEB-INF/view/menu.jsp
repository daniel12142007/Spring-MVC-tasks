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
<h1>Course</h1>
<table border="2px">
    <thead>
    <th>Courses ID:</th>
    <th>Courses:</th>
    <th>duration:</th>
    <th>Company ID:</th>
    <th>delete:</th>
    <th>update:</th>
    </thead>
    <tbody>
    <c:forEach items="${courses}" var="cour">
        <tr>
            <td>${cour.id}</td>
            <td>${cour.courName}</td>
            <td>${cour.duration}</td>
            <td>${cour.company.id}</td>
            <td>
                <form action="/deleteCourse/${cour.id}" method="get">
                    <button type="submit">delete</button>
                </form>
            </td>
            <td>
                <form action="updateCourse/${cour.id}" method="get">
                    <button type="submit">update</button>
                </form>
            </td>
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
    <th>dataStart:</th>
    <th>dataFinish:</th>
    <th>Company ID:</th>
    <th>delete:</th>
    <th>update:</th>
    </thead>
    <tbody>
    <c:forEach items="${groups}" var="groups">
        <tr>
            <td>${groups.id}</td>
            <td>${groups.groupName}</td>
            <td>${groups.dataStart}</td>
            <td>${groups.dataFinish}</td>
            <td>${groups.company.id}</td>
            <td>
                <form action="/deleteGroup/${groups.id}" method="get">
                    <button type="submit">delete</button>
                </form>
            </td>
            <td>
                <form action="/updateGroup/${groups.id}" method="get">
                    <button type="submit">update</button>
                </form>
            </td>
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
    <th>last_name:</th>
    <th>email:</th>
    <th>Course ID:</th>
    <th>delete:</th>
    <th>update:</th>
    </thead>
    <tbody>
    <c:forEach items="${teachers}" var="teacher">
        <tr>
            <td>${teacher.id}</td>
            <td>${teacher.first_name}</td>
            <td>${teacher.last_name}</td>
            <td>${teacher.email}</td>
            <td>${teacher.course.id}</td>
            <td>
                <form action="/deleteTeacher/${teacher.id}" method="get">
                    <button type="submit">delete</button>
                </form>
            </td>
            <td>
                <form action="/updateTeacher/${teacher.id}" method="get">
                    <button type="submit">update</button>
                </form>
            </td>
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
<style>
    h1 {
        font-family: "Arial Black", serif;
    }
</style>
</body>
</html>