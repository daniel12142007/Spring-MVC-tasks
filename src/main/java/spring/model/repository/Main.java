package spring.model.repository;

import spring.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Azamat", "Kyrgyzstan");
        List<Course> list = new ArrayList<>();
        Course course = new Course();
        course.setCompany(company);
        list.add(course);
        company.setCourses(list);
        List<Group> groupList = new ArrayList<>();
        Group group = new Group("it.kg", 2022, 2026);
        group.setCompany(company);
        groupList.add(group);
        company.setGroups(groupList);
//        group.setCourse(list);
//        course.setGroups(groupList);
//        Teacher teacher = new Teacher("Azamat", "Azamatovich", "aza@gmail.com");
//        teacher.setCourse(course);
//        course.setTeacher(teacher);
//        List<Student> studentList = new ArrayList<>();
//        Student student = new Student("Daniel", "Ahatdzanov", "danijelahatzanov@gmail.com", StudentFormat.OFFLINE);
//        student.setGroup(group);
//        studentList.add(student);
//        group.setStudent(studentList);
        AllRepositorys allRepository = new AllRepositorys();
        allRepository.saveCompany(company);
    }
}
