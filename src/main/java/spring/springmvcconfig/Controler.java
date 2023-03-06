package spring.springmvcconfig;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import spring.model.Course;
import spring.model.President;
import spring.model.Student;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Controler {
    private static List<Student> students = new ArrayList<>();
    private static List<Course> courses = new ArrayList<>();
    private static List<President> presidents = new ArrayList<>();

    static {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        presidents = new ArrayList<>();
        President president = new President("Azamat", 37);
        president.setId(presidents.size() + 1l);
        presidents.add(president);
        Course course = new Course("it.kg", 1);
        course.setPresident(president);
        course.setId(courses.size() + 1l);
        courses.add(course);
        president.setCourses(courses);
        Student student = new Student("A1", 1);
        Student student1 = new Student("A2", 1);
        student.setId(students.size() + 1l);
        student1.setId(students.size() + 1l);
        student.setCourse(course);
        student1.setCourse(course);
        students.add(student);
        students.add(student1);
        course.setStudents(students);
    }

    @GetMapping("/table/student")
    public String tablesStudent(Model model) {
        model.addAttribute("student", students);
        return "student";
    }

    @GetMapping("/table/course")
    public String tablesCourse(Model model) {
        model.addAttribute("course", courses);
        return "course";
    }

    @GetMapping("/table/president")
    public String tablePresident(Model model) {
        model.addAttribute("president", presidents);
        return "president";
    }
}