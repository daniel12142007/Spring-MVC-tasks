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
    @GetMapping("/")
    public String menu(Model model) {
        model.addAttribute("company",repositorys.findAllCompany());
        model.addAttribute("courses",repositorys.findAllCourse());
        model.addAttribute("groups",repositorys.findAllGroup());
        model.addAttribute("teachers",repositorys.findAllTeacher());
        model.addAttribute("student",repositorys.findAllStudent());
        return "menu";
    }

    @PostMapping("/saveCompany")
    private String saveCompany(@RequestParam("companyName") String companyName, @RequestParam("locatedCountry") String locatedCountry) {
        Company company = new Company();
        company.setCompanyName(companyName);
        company.setLocatedCountry(locatedCountry);
        return "redirect:/";
    }

    @GetMapping("/companyForm")
    public String saveFormCompany() {
        return "formCompany";
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

    @GetMapping("/updateCompany/{id}")
    public String updatePersonForm(@PathVariable("id") int id, Model model) {
        Company company = repositorys.findByIdCompany(id);
        model.addAttribute("person", company);
        return "update-company-form";
    }

    @PostMapping("/real/update/{id}")
    public String updatePerson(@RequestParam("name") String name, @RequestParam("countr") String country, @PathVariable int id) {
        Company company = new Company();
        company.setCompanyName(name);
        company.setLocatedCountry(country);
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