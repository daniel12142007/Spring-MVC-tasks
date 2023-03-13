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

<div class="gray" style="background-color: lime">
<h1>${co}</h1>
<c:forEach items="${com}" var="com">
    <h1>${com}</h1>
</c:forEach>
<c:forEach items="${comi}" var="comi">
    <h1>${comi}</h1>
</c:forEach>
<c:forEach items="${comin}" var="comin">
        <h1>${comin}</h1>
</c:forEach>
<c:forEach items="${comina}" var="comina">
    <h1>${comina}</h1>
</c:forEach>
</div>
<style>
    h1{
        color: white;
        width: 1100px;
        height:  100px;
    }
</style>

</body>
</html>