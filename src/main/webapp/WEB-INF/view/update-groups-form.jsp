<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 08.03.2023
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/updaterGroupPost/${group.id}" method="post">
    <label>groupName:</label><input value="${group.groupName}" type="text" name="groupName">
    <label>dataStart:</label><input value="${group.dataStart}" type="text" name="dataStart">
    <label>dataFinish:</label><input value="${group.dataFinish}" type="text" name="dataFinish">
    <input type="submit" value="update-group">
</form>
</body>
</html>