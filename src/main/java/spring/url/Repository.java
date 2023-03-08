package spring.url;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import spring.model.Company;

public class Repository {
    private SessionFactory sessionFactory = Utl.getConnection();
    public void save(Company company){
        try (Session session = sessionFactory.openSession()){
            session.save(company);
        }
    }
}
