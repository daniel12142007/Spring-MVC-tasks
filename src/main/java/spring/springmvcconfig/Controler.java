package spring.springmvcconfig;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.model.*;
import spring.model.repository.interfaces.Repositorys;

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

    // @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//    @Column(name = "first_name")
//    private String first_name;
//    @Column(name = "last_name")
//    private String last_name;
//    @Column(name = "email")
//    private String email;
//    @Column(name = "studentFormat")
//    private Studentforms studentforms;
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "groups_id")
//    private Groups group;
    @PostMapping("/saveStudent")
    private String saveStudent(
            @RequestParam("first_name") String first_name,
            @RequestParam("last_name") String last_name,
            @RequestParam("email") String email,
            @RequestParam("id") int id
    ) {
        Groups groups = repositorys.findByidGroup(id);
        Student student = new Student();
        student.setFirst_name(first_name);
        student.setLast_name(last_name);
        student.setEmail(email);
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

    @GetMapping("/clearCompany")
    public String clear() {
        repositorys.clearCompany();
        return "redirect:/";
    }
}
// private final PersonDao personDao;
//
//    public PersonController(PersonDao personDao) {
//        this.personDao = personDao;
//    }
//
//
//    @GetMapping("/")
//    public String findAll(Model model){
//        model.addAttribute( "all",personDao.findAll() );
//        return "find-all";
//    }
//
//    @PostMapping("/saveStudent")
//    private String saveStudent(@RequestParam("name") String name, @RequestParam("age") int age){
//        Person person = new Person();
//        person.setName(name);
//        person.setAge(age);
//        personDao.save(person);
//        return "redirect:/";
//    }
//
//    @GetMapping("/studentForm")
//    public String saveStudentPage(){
//        return "person-save";
//    }
//
//    @GetMapping("/deleteStudent/{id}")
//    public String deleteById(@PathVariable int id){
//      Person person = personDao.findById(id);
//      personDao.delete( person.getId() );
//        return "redirect:/";
//    }
//
//    @GetMapping("/get/by/{id}")
//    public  String getById(Model model, @PathVariable int id) {
//        Person person = personDao.findById(id);
//        model.addAttribute("person",person);
//        return "find";
//    }
//
//    @GetMapping("/update/{id}")
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
//
//    @GetMapping("/clear")
//    public String clear(){
//        personDao.clear();
//        return "redirect:/";
//    }