package spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import spring.model.Course;
import spring.model.President;
import spring.model.Student;
import spring.model.repository.AllRepository;
import spring.url.Url;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        AllRepository allRepository = new AllRepository();
        President president = new President("Azamat", 36);
        Course course = new Course("it.kg", 1);
        course.setPresident(president);
        courses.add(course);
        president.setCourses(courses);
        Student student = new Student("Daniel", 15);
        student.setCourse(course);
        students.add(student);
        course.setStudents(students);

// save
//        allRepository.savePresident(president);
        System.out.println(allRepository.findallPresident());
    }
}