<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 08.03.2023
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
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
          <button type="submit">
            <a href="/updateTeacher/${teacher.id}}">
            update
            </a>
          </button>
        </form>
      </td>
    </tr>
  </c:forEach>
  </tbody>
</table>
<button><a href="/teacherForm">register Teacher</a></button>
<button><a href="/">back</a></button>
</body>
</html>