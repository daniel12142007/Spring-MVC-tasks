package spring.url;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import spring.model.Course;
import spring.model.Company;
import spring.model.Teacher;

public class Url {
    private static final SessionFactory connection;

    static {
        connection = new Configuration()
                .setProperty(Environment.DRIVER, "org.postgresql.Driver")
                .setProperty(Environment.URL, "jdbc:postgresql://localhost:5432/postgres")
                .setProperty(Environment.USER, "postgres")
                .setProperty(Environment.PASS, "root")
                .setProperty(Environment.HBM2DDL_AUTO, "create")
                .setProperty(Environment.SHOW_SQL, "true")
                .setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL10Dialect")
                .addAnnotatedClass(Company.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Teacher.class)
                .buildSessionFactory();
    }

    public static SessionFactory getS() {
        return connection;
    }
}
// static {
//        sessionFactory = new Configuration()
//                .setProperty(Environment.DRIVER, "org.postgresql.Driver")
//                .setProperty(Environment.URL, "jdbc:postgresql://localhost:5432/postgres")
//                .setProperty(Environment.USER, "postgres")
//                .setProperty(Environment.PASS, "root")
//                .setProperty(Environment.HBM2DDL_AUTO, "update")
//                .setProperty(Environment.SHOW_SQL, "true")
//                .setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL10Dialect")
//                .addAnnotatedClass(Person.class)
//                .addAnnotatedClass(Phone.class)
//                .addAnnotatedClass(Details.class)
//                .buildSessionFactory();
//    }