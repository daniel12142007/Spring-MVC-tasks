<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 08.03.2023
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="bg-image">
    <h1><a href="https://github.com/daniel12142007">GitHub</a></h1>
    <h1>Company</h1>
    <table border="2px">
        <thead>
        <th>Companies ID:</th>
        <th>Company:</th>
        <th>locatedCountry:</th>
        <th>delete:</th>
        <th>update:</th>
        </thead>
        <tbody>
        <c:forEach items="${company}" var="com">
            <tr>
                <td>${com.id}</td>
                <td>${com.companyName}</td>
                <td>${com.locatedCountry}</td>
                <td>
                    <form action="/deletebyCompany/${com.id}" method="get">
                        <button type="submit"><a>
                            delete
                        </a>
                        </button>
                    </form>
                </td>
                <td>
                    <form action="updateCompany/${com.id}" method="get">
                        <button type="submit"><a href="/updateCompany/${com.id}">update</a></button>
                    </form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div style="display: flex; justify-content: center">
        <button class="button"><a class="a" href="/companyForm">register Company</a></button>
        <button class="button"><a class="a" href="/">back</a></button>
        <div>
        </div>
        <style>
            * {
                padding: 0;
                margin: 0;
            }

            .bg-image {
                background-image: url("https://wallpapers-fenix.eu/full/180331/101017562.jpg");
                width: 100%;
                background-size: cover;
                background-repeat: no-repeat;
                height: 700px;
            }

            table {
                width: 70%;
                max-width: 30rem;
                margin: 0 auto;
                box-shadow: 0 3px 10px rgb(0 0 0 / 0.2);
                border-radius: 3px;

            }

            .button {
                padding: 20px;
                margin: 10px;
                background: none;
            }

            .a {
                color: white;
                text-decoration: none;
            }

            .a:hover {
                color: red;
            }

            button {
                background: none;
            }

            th {
                color: white;
            }

            td {
                color: white;
            }

            a {
                color: white;
            }

            button {
                color: white;
            }
        </style>
</body>
</html>