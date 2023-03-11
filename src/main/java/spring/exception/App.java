package spring.exception;

import spring.model.*;
import spring.model.enums.Studentforms;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Repository repository1 = new Repository();
        List<Course> courses = new ArrayList<>();
        List<Groups> groups = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        Company company = new Company("Iphone", "USA");
        Course course = new Course("java", "9");
        Teacher teacher = new Teacher("Azamat", "Azamatovich", "azamat@gmail.com");
        teacher.setCourse(course);
        course.setTeacher(teacher);
        course.setCompany(company);
        courses.add(course);
        Groups group = new Groups("java A ultimate", "2022", "2023");
        Student student = new Student("Daniel", "Ahatzanov", "daniel@gmail,com", Studentforms.OFFLINE);
        student.setGroup(group);
        students.add(student);
        group.setStudents(students);
        group.setCompany(company);
        groups.add(group);
        company.setGroups(groups);
        company.setCourses(courses);
        group.setCourses(courses);
        course.setGroups(groups);
        repository1.save(company);


    }
}