package spring.springmvcconfig;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.model.*;
import spring.model.enums.Studentforms;
import spring.model.repository.interfaces.Repositorys;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
public class Controler {
    private final Repositorys<Company, Course, Groups, Teacher, Student> repositorys;

    public Controler(Repositorys<Company, Course, Groups, Teacher, Student> repositorys) {
        this.repositorys = repositorys;
    }

    // menu
    @GetMapping("/")
    public String menu(Model model) {
        model.addAttribute("company", repositorys.findAllCompany());
        model.addAttribute("courses", repositorys.findAllCourse());
        model.addAttribute("groups", repositorys.findAllGroup());
        model.addAttribute("teachers", repositorys.findAllTeacher());
        model.addAttribute("student", repositorys.findAllStudent());
        return "menu";
    }

    @GetMapping("/table/company")
    public String tableCompany(Model model) {
        model.addAttribute("company", repositorys.findAllCompany());
        return "table-company";
    }

    @GetMapping("/table/course")
    public String tableCourse(Model model) {
        model.addAttribute("courses", repositorys.findAllCourse());
        return "table-course";
    }

    @GetMapping("/table/group")
    public String tableGroup(Model model) {
        model.addAttribute("groups", repositorys.findAllGroup());
        return "table-group";
    }

    @GetMapping("/table/student")
    public String tableStudent(Model model) {
        model.addAttribute("student", repositorys.findAllStudent());
        return "table-student";
    }

    @GetMapping("/table/teacher")
    public String tableTeacher(Model model) {
        model.addAttribute("teachers", repositorys.findAllTeacher());
        return "table-tacher";
    }

    // save Company
    @PostMapping("/saveCompany")
    private String saveCompany(
            @RequestParam("companyName") String companyName,
            @RequestParam("locatedCountry") String locatedCountry
    ) {
        Company company = new Company();
        company.setCompanyName(companyName);
        company.setLocatedCountry(locatedCountry);
        repositorys.saveCompany(company);
        return "redirect:/";
    }

    //save forms company
    @GetMapping("/companyForm")
    public String saveFormCompany() {
        return "save";
    }

    //save Course
    @PostMapping("/saveCourse")
    private String saveCourse(
            @RequestParam("courName") String courName,
            @RequestParam("duration") String duration,
            @RequestParam("id") int id) {
        Company company = repositorys.findByIdCompany(id);
        Course course = new Course();
        course.setCourName(courName);
        course.setDuration(duration);
        course.setCompany(company);
        repositorys.saveCourse(course);
        return "redirect:/";
    }

    // save forms course
    @GetMapping("/courseForm")
    public String saveFormCourse(Model model) {
        model.addAttribute("all", repositorys.findAllCompany());
        return "saveCourse";
    }

    //save groups
    @PostMapping("/saveGroups")
    private String saveGroups(
            @RequestParam("groupName") String groupName,
            @RequestParam("dataStart") String dataStart,
            @RequestParam("dataFinish") String dataFinish,
            @RequestParam("id") int id
    ) {
        Company company = repositorys.findByIdCompany(id);
        Groups groups = new Groups();
        groups.setGroupName(groupName);
        groups.setDataStart(dataStart);
        groups.setDataFinish(dataFinish);
        groups.setCompany(company);
        repositorys.saveGroup(groups);
        return "redirect:/";
    }

    // save forms groups
    @GetMapping("/groupsForm")
    public String saveFormGroups(Model model) {
        model.addAttribute("all", repositorys.findAllCompany());
        return "saveGroups";
    }

    @GetMapping("/deletebyCompany/{id}")
    public String deletebyidCompany(@PathVariable int id) {
        Company company = repositorys.findByIdCompany(id);
        repositorys.deleteCompany(company.getId());
        return "redirect:/";
    }

    @GetMapping("/getCompany/by/{id}")
    public String getbyIdCompany(Model model, @PathVariable int id) {
        Company company = repositorys.findByIdCompany(id);
        model.addAttribute("company", company);
        return "findCompany";
    }

    //save groups
    @PostMapping("/saveTeacher")
    private String saveTeacher(
            @RequestParam("first_name") String first_name,
            @RequestParam("last_name") String last_name,
            @RequestParam("email") String email,
            @RequestParam("id") int id
    ) {
        Course course = repositorys.findByIdCourse(id);
        Teacher teacher = new Teacher();
        teacher.setFirst_name(first_name);
        teacher.setLast_name(last_name);
        teacher.setEmail(email);
        teacher.setCourse(course);
        repositorys.saveTeacher(teacher);
        return "redirect:/";
    }

    // save forms groups
    @GetMapping("/teacherForm")
    public String saveFormTeacher(Model model) {
        model.addAttribute("all", repositorys.findAllCourse());
        return "saveTeacher";
    }

    @PostMapping("/saveStudent")
    private String saveStudent(
            @RequestParam("first_name") String first_name,
            @RequestParam("last_name") String last_name,
            @RequestParam("email") String email,
            @RequestParam("format") Studentforms studentforms,
            @RequestParam("id") int id
    ) {
        Groups groups = repositorys.findByidGroup(id);
        Student student = new Student();
        student.setFirst_name(first_name);
        student.setLast_name(last_name);
        student.setEmail(email);
        student.setStudentforms(studentforms);
        student.setGroup(groups);
        repositorys.saveStudent(student);
        return "redirect:/";
    }

    // save forms groups
    @GetMapping("/studentForm")
    public String saveFormStudent(Model model) {
        model.addAttribute("all", repositorys.findAllGroup());
        return "saveStudent";
    }

    @GetMapping("/updateCompany/{id}")
    public String updatePersonForm(@PathVariable("id") int id, Model model) {
        Company company = repositorys.findByIdCompany(id);
        model.addAttribute("company", company);
        return "update-company-form";
    }

    @PostMapping("/updateCompanyPost/{id}")
    public String updatePerson(
            @RequestParam("companyName") String companyName,
            @RequestParam("locatedCountry") String locatedCountry,
            @PathVariable int id) {
        Company company = new Company();
        company.setCompanyName(companyName);
        company.setLocatedCountry(locatedCountry);
        repositorys.updateCompany(id, company);
        return "redirect:/";
    }


    @GetMapping("/updateCourse/{id}")
    public String updateCourseForm(@PathVariable("id") int id, Model model) {
        Course course = repositorys.findByIdCourse(id);
        model.addAttribute("course", course);
        return "update-course-form";
    }

    @PostMapping("/updateCoursePost/{id}")
    public String updateCourse(
            @RequestParam("courName") String courName,
            @RequestParam("duration") String duration,
            @PathVariable int id) {
        Course course = new Course();
        course.setCourName(courName);
        course.setDuration(duration);
        repositorys.updateCourse(id, course);
        return "redirect:/";
    }


    @GetMapping("/updateGroup/{id}")
    public String updateGroupForm(@PathVariable("id") int id, Model model) {
        Groups groups = repositorys.findByidGroup(id);
        model.addAttribute("groups", groups);
        return "update-groups-form";
    }

    @PostMapping("/updaterGroupPost/{id}")
    public String updateGroup(
            @RequestParam("groupName") String groupName,
            @RequestParam("dataStart") String dataStart,
            @RequestParam("dataFinish") String dataFinish,
            @PathVariable int id) {
        Groups groups = new Groups();
        groups.setGroupName(groupName);
        groups.setDataStart(dataStart);
        groups.setDataFinish(dataFinish);
        repositorys.updateGroup(id, groups);
        return "redirect:/";
    }


    @GetMapping("/updateTeacher/{id}")
    public String updateTeacherForm(@PathVariable("id") int id, Model model) {
        Teacher teacher = repositorys.findByidTeacher(id);
        model.addAttribute("teacher", teacher);
        return "update-teacher-form";
    }

    @PostMapping("/updaterTeacherPost/{id}")
    public String updateTeacher(
            @RequestParam("first_name") String first_name,
            @RequestParam("last_name") String last_name,
            @RequestParam("email") String email,
            @PathVariable int id) {
        Teacher teacher = new Teacher();
        teacher.setFirst_name(first_name);
        teacher.setLast_name(last_name);
        teacher.setEmail(email);
        repositorys.updateTeacher(id, teacher);
        return "redirect:/";
    }


    @GetMapping("/updateStudent/{id}")
    public String updateStudentForm(@PathVariable("id") int id, Model model) {
        Student student = repositorys.findByidStudent(id);
        model.addAttribute("student", student);
        return "update-student-form";
    }

    @PostMapping("/updateStudentPost/{id}")
    public String updateStudent(
            @RequestParam("first_name") String first_name,
            @RequestParam("last_name") String last_name,
            @RequestParam("email") String email,
            @RequestParam("studentforms") Studentforms studentforms,
            @PathVariable int id) {
        Student student = new Student();
        student.setFirst_name(first_name);
        student.setLast_name(last_name);
        student.setEmail(email);
        student.setStudentforms(studentforms);
        repositorys.updateStudent(id, student);
        return "redirect:/";
    }


    @GetMapping("deleteStudent/{id}")
    public String deleteByid(@PathVariable int id) {
        repositorys.deleteStudent(id);
        return "redirect:/";
    }

    @GetMapping("deleteGroup/{id}")
    public String deletebyIdGroup(@PathVariable int id) {
        repositorys.deleteGroup(id);
        return "redirect:/";
    }

    @GetMapping("deleteCourse/{id}")
    public String deletebyIdCourse(@PathVariable int id) {
        repositorys.deleteCourse(id);
        return "redirect:/";
    }

    @GetMapping("deleteTeacher/{id}")
    public String deletebyIDTeacher(@PathVariable int id) {
        repositorys.deleteTeacher(id);
        return "redirect:/";
    }

    @GetMapping("deleteCompany/{id}")
    public String deletebyIDCompany(@PathVariable int id) {
        repositorys.deleteCompany(id);
        return "redirect:/";
    }
}
// @GetMapping("/update/{id}")
//    public String updatePersonForm(@PathVariable("id") int id, Model model) {
//        Person person = personDao.findById(id);
//        model.addAttribute("person", person);
//        return "update-person-form";
//    }
//
//    @PostMapping("/real/update/{id}")
//    public String updatePerson(@RequestParam("name") String name,@RequestParam("age") int age,@PathVariable int id) {
//        Person person = new Person();
//        person.setName( name );
//        person.setAge( age );
//        personDao.updatePerson(id,person);
//        return "redirect:/";
//    }