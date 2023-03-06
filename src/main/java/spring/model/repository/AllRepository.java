package spring.model.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import spring.model.*;
import spring.model.repository.interfaces.Repository;
import spring.url.Url;

import java.util.List;

public class AllRepository implements Repository<Company, Course, Teacher, Group, Student> {
    private final SessionFactory sessionFactory = Url.getS();

    public void saveCompany(Company t) {
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

    public void saveTeacher(Teacher teacher) {
        try (Session session = sessionFactory.openSession()) {
            session.save(teacher);
            System.out.println("save->" + teacher);
        }
    }

    public void saveGroup(Group group) {
        try (Session session = sessionFactory.openSession()) {
            session.save(group);
            System.out.println("save->" + group);
        }
    }

    public void saveStudent(Student student) {
        try (Session session = sessionFactory.openSession()) {
            session.save(student);
            System.out.println("save->" + student);
        }
    }

    public List findallComapny() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select p from Company p").getResultList();
        }
    }

    public List findallCourse() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select c from Course c").getResultList();
        }
    }

    public List findallTeacher() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select s from Teacher s").getResultList();
        }
    }

    public List findallGroup() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select a from Group a ").getResultList();
        }
    }

    public List findallStudent() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select h from Student h").getResultList();
        }
    }

}
