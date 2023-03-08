package spring.url;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import spring.model.Company;
import spring.model.Course;
import spring.model.Groups;

public class Repository {
    private SessionFactory sessionFactory = Utl.getConnection();

    public void save(Company company) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(company);
            session.getTransaction().commit();
        }
    }
    public void saveCourse(Course course){
        try (Session session = sessionFactory.openSession()){
            session.beginTransaction();
            session.save(course);
            session.getTransaction().commit();
        }
    }
    public void saveGroup(Groups groups){
        try(Session session = sessionFactory.openSession()){
//            session.beginTransaction();
            session.save(groups);
//            session.getTransaction().commit();
        }

    }
}
