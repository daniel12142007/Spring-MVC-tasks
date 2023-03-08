<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 08.03.2023
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/updateCompanyPost/${company.id}" method="post">
    <label>companyName:</label><input value="${company.companyName}" type="text" name="companyName">
    <label>locatedCountry:</label><input value="${company.locatedCountry}" type="text" name="locatedCountry">
    <input type="submit" value="update-person">
</form>

</body>
</html>
