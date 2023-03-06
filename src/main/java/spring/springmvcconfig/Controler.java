package spring.springmvcconfig;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import spring.model.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Controler {
    private static List<Object> objectList = new ArrayList<>();
    private static List<Company> companies = new ArrayList<>();
    private static List<Course> courses = new ArrayList<>();
    private static List<Teacher> teachers = new ArrayList<>();
    private static List<Group> groups = new ArrayList<>();
    private static List<Student> students = new ArrayList<>();

    static {
        companies = new ArrayList<>();
        courses = new ArrayList<>();
        groups = new ArrayList<>();
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        Company company = new Company("Java", "USA");
        company.setId(companies.size() + 1l);
        companies.add(company);
        Course course = new Course("it.kg", 9);
        course.setId(courses.size() + 1l);
        course.setCompany(company);
        courses.add(course);
        company.setCourses(courses);
        Group group = new Group("java A", 2022, 2023);
        group.setId(groups.size() + 1l);
        group.setCompany(company);
        groups.add(group);
        company.setGroups(groups);
        Teacher teacher = new Teacher("Daniel", "Ahatzanov", "daniel@gmail,com");
        teacher.setId(teachers.size() + 1l);
        teacher.setCourse(course);
        course.setTeacher(teacher);
        teachers.add(teacher);
        Student student = new Student("Beknur", "Arapow", "beknur@gmail.com", StudentFormat.OFFLINE);
        student.setId(students.size() + 1l);
        student.setGroup(group);
        students.add(student);
        group.setStudent(students);
        group.setCourse(courses);
        course.setGroups(groups);
    }

    @GetMapping("/")
    public String menu() {
        return "menu";
    }

    @GetMapping("/find/company")
    public String companyfind(Model model) {
        model.addAttribute("company", companies);
        return "company";
    }

    @GetMapping("/find/courses")
    public String coursesfind(Model model) {
        model.addAttribute("courses", courses);
        return "courses";
    }

    @GetMapping("/find/group")
    public String groupfind(Model model) {
        model.addAttribute("group", groups);
        return "group";
    }

    @GetMapping("/find/teacher")
    public String teacherfind(Model model) {
        model.addAttribute("teacher", teachers);
        return "teacher";
    }

    @GetMapping("/find/student")
    public String studentfind(Model model) {
        model.addAttribute("student", students);
        return "student";
    }
}