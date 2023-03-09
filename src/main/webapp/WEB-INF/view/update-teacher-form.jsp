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
    <label>first_name:</label><br><input value="${teacher.first_name}" type="text" name="first_name"><br>
    <label>last_name:</label><br><input value="${teacher.last_name}" type="text" name="last_name"><br>
    <label>email:</label><br><input value="${teacher.email}" type="text" name="email"><br>
    <input type="submit" value="update-teacher">
</form>
<style>
    form {
        width: 70%;
        max-width: 30rem;
        margin: 2rem auto;
        padding: 2rem;
        box-shadow: 0 3px 10px rgb(0 0 0 / 0.2);
        border-radius: 3px;
        display: flex;
        flex-direction: column;
    }

    form label {
        font-weight: bold;
        flex: 1;
        color: rgb(0, 0, 0);
        margin-bottom: 0.5rem;
        margin-top: 10px;
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