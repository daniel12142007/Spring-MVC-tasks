<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 08.03.2023
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/updaterTeacherPost/${teacher.id}" method="post">
    <label>first_name:</label><input value="${teacher.first_name}" type="text" name="first_name">
    <label>last_name:</label><input value="${teacher.last_name}" type="text" name="last_name">
    <label>email:</label><input value="${teacher.email}" type="text" name="email">
    <input type="submit" value="update-group">
</form>
</body>
</html>
