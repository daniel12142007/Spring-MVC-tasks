<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 08.03.2023
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/updateCoursePost/${course.id}" method="post">
    <label>courName:</label><input value="${course.courName}" type="text" name="courName">
    <label>duration:</label><input value="${course.duration}" type="text" name="duration">
    <input type="submit" value="update-course">
</form>
</body>
</html>
