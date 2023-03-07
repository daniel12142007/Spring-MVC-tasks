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
<table border="2px">
    <thead>
    <th>Companies ID:</th>
    <th>Company:</th>
    <th>Courses:</th>
    <th>Groups:</th>
    <th>Teachers:</th>
    <th>Students:</th>
    </thead>
    <tbody>
    <%--     model.addAttribute("groups",repositorys.findAllGroup());
            model.addAttribute("teachers",repositorys.findAllTeacher());
            model.addAttribute("student",repositorys.findAllStudent());--%>
    <tr>
        <c:forEach items="${company}" var="com">
            <td>${com.id}</td>
            <td>${com.companyName}</td>
        </c:forEach>
        <c:forEach items="${courses}" var="cour">
            <td>${cour.courName}</td>
        </c:forEach>
        <c:forEach items="${groups}" var="groups">
            <td>${groups.groupName}</td>
        </c:forEach>
        <c:forEach items="${teachers}" var="teacher">
            <td>${teacher.first_name}</td>
        </c:forEach>
        <c:forEach items="${student}" var="student">
            <td>${student.first_name}</td>
        </c:forEach>
    </tr>

    </tbody>
</table>
</body>
</html>
<%--<table border="2px">
    <thead>
    <th>id:</th>
    <th>groupName:</th>
    <th>dataStart:</th>
    <th>dataFinish:</th>
    <th>company_id:</th>
    </thead>
    <tbody>
    <c:forEach items="${all}" var="arr">
        <tr>
            <td>${arr.id}</td>
            <td>${arr.groupName}</td>
            <td>${arr.dataStart}</td>
            <td>${arr.dataFinish}</td>
            <td>${arr.company.id}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>--%>