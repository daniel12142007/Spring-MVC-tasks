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
<h1><a href="https://github.com/daniel12142007">GitHub</a></h1>
<form action="/updateCoursePost/${course.id}" method="post">
    <label>courName:</label><br><input value="${course.courName}" type="text" name="courName"><br>
    <label>duration:</label><br><input value="${course.duration}" type="text" name="duration"><br>
    <input type="submit" value="update-course">
</form>
</body>
</html>
