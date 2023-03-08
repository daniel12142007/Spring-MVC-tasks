package spring.url;

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
        repository1.saveCourse(course);
        List<Course> group1Courses = new ArrayList<>();
        group1Courses.add(course);
        Teacher teacher = new Teacher("Azamat", "Azamatovich", "azamat@gmail.com");
        teacher.setCourse(course);
        course.setTeacher(teacher);
        course.setCompany(company);
        courses.add(course);
        company.setCourses(courses);
        Groups group = new Groups("java A ultimate", "2022", "2023");
        group.setCourses(group1Courses);
        course.setCourses(group1Courses);
        repository1.saveGroup(group);
        group.setCourses(courses);
        Student student = new Student("Daniel", "Ahatzanov", "daniel@gmail,com", Studentforms.OFFLINE);
        student.setGroup(group);
        students.add(student);
        group.setStudents(students);
        group.setCompany(company);
        groups.add(group);
        company.setGroups(groups);
//        repository1.saveGroup(group);
        repository1.save(company);
    }
}