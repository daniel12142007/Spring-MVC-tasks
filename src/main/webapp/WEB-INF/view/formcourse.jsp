<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 06.03.2023
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/save/course" method="post">
    <label>NameCourse:</label><input type="text" name="name">
    <label>Age:</label><input type="text" name="age">
    <button>register</button>
</form>
</body>
</html>
<%-- @PostMapping("/save/course")
    private String saveCourse(@RequestParam("name") String name, @RequestParam("age") int age) {
        Course course = new Course();
        course.setId(companies.size() + 1l);
        course.setCourName(name);
        course.setYear(age);
        return "redirect:/";
    }

    @GetMapping("/form/course")
    public String formcourses() {
        return "/formcourse";
    }
--%>