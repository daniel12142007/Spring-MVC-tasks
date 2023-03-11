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
<div class="bg">
    <form action="/saveCompany" method="post">
        <label>Company Name</label><br>
        <input type="text" name="companyName"><br>
        <label>LocatedCountry</label><br>
        <input type="text" name="locatedCountry"><br>
        <input type="submit" value="register company">
    </form>
</div>
<style>
    body {
        margin: 0;
    }

    .bg {
        background: chartreuse;
        width: 100%;
        background-size: cover;
        background-repeat: no-repeat;
        height: 700px;
    }

    form {
        width: 70%;
        max-width: 30rem;
        box-shadow: 0 3px 10px rgb(0 0 0 / 0.2);
        border-radius: 3px;
        display: flex;
        margin: 0 auto;
        flex-direction: column;
    }

    form label {
        font-weight: bold;
        flex: 1;
        color: rgb(0, 0, 0);
        margin-bottom: 0.5rem;
        margin-top: 10px;
        color: white;
    }

    form input {
        box-shadow: 4px 4px 10px rgba(0, 0, 0, 0.06);
        flex: 3;
        font-weight: bold;
        font: inherit;
        padding: 0.35rem 0.35rem;
        border-radius: 6px;
        border: 1px solid #ccc;
    }

    button {
        margin-top: 20px;
        background-color: black;
        color: white;

    }
</style>
</body>
</html>