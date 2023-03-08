<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 07.03.2023
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--@RequestParam("companyName") String companyName, @RequestParam("locatedCountry") String locatedCountry--%>
<form action="/saveCompany" method="post">
    <label>Company Name</label><br><input type="text" name="companyName"><br>
    <label>LocatedCountry</label><br><input type="text" name="locatedCountry"><br>
    <input type="submit" value="register company">
</form>
</body>
</html>
