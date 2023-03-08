<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 08.03.2023
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/updateStudentPost/${student.id}" method="post">
    <label>first_name:</label><input value="${student.first_name}" type="text" name="first_name">
    <label>last_name:</label><input value="${student.last_name}" type="text" name="last_name">
    <label>email:</label><input value="${student.email}" type="text" name="email">
    <label>studentforms:</label><input value="${student.studentforms}" name="studentforms">
    <input type="submit" value="update-student">
</form>
</body>
</html>
