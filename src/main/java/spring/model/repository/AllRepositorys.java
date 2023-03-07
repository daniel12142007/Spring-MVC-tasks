package spring.model.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.model.*;
import spring.model.repository.interfaces.Repositorys;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class AllRepositorys implements Repositorys<Company, Course, Group, Teacher, Student> {
    @Autowired
    private SessionFactory sessionFactory;

    // TODO: Company
    @Override
    public List<Company> findAllCompany() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select c from Company c", Company.class).getResultList();
    }

    @Override
    public Company findByIdCompany(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Company.class, id);
    }

    @Override
    public void saveCompany(Company ompany) {
        Session session = sessionFactory.getCurrentSession();
        session.save(ompany);
    }

    @Override
    public void deleteCompany(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("delete from Company where id=:companyId").setParameter("companyId", id).executeUpdate();
    }

    @Override
    public void updateCompany(int id, Company company) {
        Session session = sessionFactory.getCurrentSession();
        Company company1 = findByIdCompany(id);
        company1.setCompanyName(company.getCompanyName());
        company1.setCountry(company.getCountry());
        session.merge(company1);
    }

    @Override
    public void clearCompany() {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("delete from Company").executeUpdate();
    }

    // TODO: Course
    @Override
    public List<Course> findAllCourse() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select cour from Course cour", Course.class).getResultList();
    }

    @Override
    public Course findByIdCourse(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Course.class, id);
    }

    @Override
    public void saveCourse(Course course) {
        Session session = sessionFactory.getCurrentSession();
        session.save(course);
    }

    @Override
    public void deleteCourse(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("delete from Course where id=:courseId").setParameter("courseId", id).executeUpdate();
    }

    @Override
    public void updateCourse(int id, Course course) {
        Session session = sessionFactory.getCurrentSession();
        Course course1 = findByIdCourse(id);
        course1.setCourName(course.getCourName());
        course1.setYear(course.getYear());
        session.merge(course1);
    }

    @Override
    public void clearCourse() {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("delete from Course ").executeUpdate();
    }
    // TODO: Teacher
    // TODO: Student

    @Override
    public List<Group> findAllGroup() {
        return null;
    }

    @Override
    public Group findByidGroup(int id) {
        return null;
    }

    @Override
    public void saveGroup(Group group) {

    }

    @Override
    public void deleteGroup(int id) {

    }

    @Override
    public void updateGroup(int id, Group group) {

    }

    @Override
    public void clearGroup() {

    }

    @Override
    public List<Student> findAllStudent() {
        return null;
    }

    @Override
    public Student findByidStudent(int id) {
        return null;
    }

    @Override
    public void saveStudent(Student student) {

    }

    @Override
    public void deleteStudent(int id) {

    }

    @Override
    public void updateStudent(int id, Student student) {

    }

    @Override
    public void clearStudent() {

    }


    @Override
    public List<Teacher> findAllTeacher() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select t from Teacher t", Teacher.class).getResultList();
    }

    @Override
    public Teacher findByidTeacher(int id) {
        return null;
    }

    @Override
    public void saveTeacher(Teacher teacher) {

    }

    @Override
    public void deleteTeacher(int id) {

    }

    @Override
    public void updateTeacher(int id, Teacher teacher) {

    }

    @Override
    public void clearTeacher() {

    }
//    @Override
//    public List<Person> findAll() {
//        Session session = sessionFactory.getCurrentSession();
//        return session.createQuery( "select c from Person c", Person.class ).getResultList();
//    }
//
//    @Override
//    public Person findById(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        return session.get( Person.class, id );
//    }
//
//
//    @Override
//    public void save(Person person) {
//        Session session = sessionFactory.getCurrentSession();
//        session.save( person );
//    }
//
//    @Override
//    public void delete(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        session.createQuery( "delete from Person where id=:personId" ).setParameter( "personId", id ).executeUpdate();
//    }
//
//    @Override
//    public void updatePerson(int id,Person person) {
//        Session session = sessionFactory.getCurrentSession();
//        Person person1 =findById(id);
//        person1.setName( person.getName() );
//        person1.setAge( person.getAge() );
//        session.merge(person1);
//    }
//
//    @Override
//    public void clear() {
//        Session session = sessionFactory.getCurrentSession();
//        session.createQuery("delete from Person ").executeUpdate();
//    }
//}
}
