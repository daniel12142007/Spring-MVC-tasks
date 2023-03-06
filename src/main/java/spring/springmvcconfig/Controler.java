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
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private List<President> presidents = new ArrayList<>();

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
// List<Course> courses = new ArrayList<>();
//        List<Student> students = new ArrayList<>();
//        AllRepository allRepository = new AllRepository();
//        President president = new President("Azamat", 36);
//        Course course = new Course("it.kg", 1);
//        course.setPresident(president);
//        courses.add(course);
//        president.setCourses(courses);
//        Student student = new Student("Daniel", 15);
//        student.setCourse(course);
//        students.add(student);
//        course.setStudents(students);