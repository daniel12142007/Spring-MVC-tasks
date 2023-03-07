package spring.springmvcconfig;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
//        companies = new ArrayList<>();
//        courses = new ArrayList<>();
//        groups = new ArrayList<>();
//        teachers = new ArrayList<>();
//        students = new ArrayList<>();
//        Company company = new Company("Java", "USA");
//        company.setId(companies.size() + 1l);
//        companies.add(company);
//        Course course = new Course("it.kg", 9);
//        course.setId(courses.size() + 1l);
//        course.setCompany(company);
//        courses.add(course);
//        company.setCourses(courses);
//        Group group = new Group("java A", 2022, 2023);
//        group.setId(groups.size() + 1l);
//        group.setCompany(company);
//        groups.add(group);
//        company.setGroups(groups);
//        Teacher teacher = new Teacher("Daniel", "Ahatzanov", "daniel@gmail,com");
//        teacher.setId(teachers.size() + 1l);
////        teacher.setCourse(course);
////        course.setTeacher(teacher);
//        teachers.add(teacher);
//        Student student = new Student("Beknur", "Arapow", "beknur@gmail.com", StudentFormat.OFFLINE);
//        student.setId(students.size() + 1l);
////        student.setGroup(group);
//        students.add(student);
////        group.setStudent(students);
////        group.setCourse(courses);
////        course.setGroups(groups);
    }

    @PostMapping("/save")
    private String saveCompany(@RequestParam("name") String name, @RequestParam("country") String country) {
        Company company = new Company();
        company.setId(companies.size() + 1l);
        company.setCompanyName(name);
        company.setCountry(country);
        companies.add(company);
        return "redirect:/";
    }

    @GetMapping("/form/company")
    public String formcompany() {
        return "formcompany";
    }

    @PostMapping("/save/course")
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

    @PostMapping("/save/group")
    private String saveGroup(@RequestParam("name") String name, @RequestParam("start") int start, @RequestParam("finish") int finish) {
        Group group = new Group();
        group.setId(groups.size() + 1l);
        group.setGroupName(name);
        group.setStart(start);
        group.setFinish(finish);
        return "redirect:/";
    }

    @GetMapping("/form/group")
    public String formgroup() {
        return "formgroup";
    }

    @GetMapping("/")
    public String menu() {
        return "menu";
    }

    @PostMapping("/save/teacher")
    private String saveTeacher(@RequestParam("first_name") String first_name, @RequestParam("last_name") String lust_name, @RequestParam String email) {
        Teacher teacher = new Teacher();
        teacher.setId(teachers.size() + 1l);
        teacher.setFirst_name(first_name);
        teacher.setLast_name(lust_name);
        teacher.setEmail(email);
        return "redirect:/";
    }

    @GetMapping("form/teacher")
    public String formteacher() {
        return "formteacher";
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