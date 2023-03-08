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
<form action="/updaterGroupPost/${groups.id}" method="post">
    <label>groupName:</label><input value="${groups.groupName}" type="text" name="groupName">
    <label>dataStart:</label><input value="${groups.dataStart}" type="text" name="dataStart">
    <label>dataFinish:</label><input value="${groups.dataFinish}" type="text" name="dataFinish">
    <input type="submit" value="update-groups">
</form>
</body>
</html>