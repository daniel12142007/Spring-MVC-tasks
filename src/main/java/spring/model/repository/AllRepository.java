package spring.model.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import spring.model.Course;
import spring.model.President;
import spring.model.Student;
import spring.model.repository.interfaces.Repository;
import spring.url.Url;

import java.util.List;

public class AllRepository implements Repository<President, Course, Student> {
    private final SessionFactory sessionFactory = Url.getS();

    public void savePresident(President t) {
        try (Session session = sessionFactory.openSession()) {
            session.save(t);
            System.out.println("save->" + t);
        }
    }

    public void saveCourse(Course course) {
        try (Session session = sessionFactory.openSession()) {
            session.save(course);
            System.out.println("save->" + course);
        }
    }

    public void saveStudent(Student student) {
        try (Session session = sessionFactory.openSession()) {
            session.save(student);
            System.out.println("save->" + student);
        }
    }

    public List findallPresident() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select p from President p").getResultList();
        }
    }

    public List findallCourse() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select c from Course c").getResultList();
        }
    }

    public List findallStudent() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select s from Student s").getResultList();
        }
    }
}
