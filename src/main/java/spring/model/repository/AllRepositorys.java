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
    @Override
    public List<Teacher> findAllTeacher() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select t from Teacher t", Teacher.class).getResultList();
    }

    @Override
    public Teacher findByidTeacher(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Teacher.class, id);
    }

    @Override
    public void saveTeacher(Teacher teacher) {
        Session session = sessionFactory.getCurrentSession();
        session.save(teacher);
    }

    @Override
    public void deleteTeacher(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("delete from Teacher where id=:teacherId").setParameter("teacherId", id).executeUpdate();
    }

    @Override
    public void updateTeacher(int id, Teacher teacher) {
        Session session = sessionFactory.getCurrentSession();
        Teacher teacher1 = findByidTeacher(id);
        teacher1.setFirst_name(teacher.getFirst_name());
        teacher1.setLast_name(teacher.getLast_name());
        teacher1.setEmail(teacher.getEmail());
        session.merge(teacher1);
    }

    @Override
    public void clearTeacher() {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("delete from Teacher ").executeUpdate();
    }
    // TODO: Group
    @Override
    public List<Group> findAllGroup() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select g from Group g", Group.class).getResultList();
    }

    @Override
    public Group findByidGroup(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Group.class, id);
    }

    @Override
    public void saveGroup(Group group) {
        Session session = sessionFactory.getCurrentSession();
        session.save(group);
    }

    @Override
    public void deleteGroup(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("delete from Group where id=:groupId").setParameter("groupId", id).executeUpdate();
    }

    @Override
    public void updateGroup(int id, Group group) {
        Session session = sessionFactory.getCurrentSession();
        Group group1 = findByidGroup(id);
        group1.setGroupName(group.getGroupName());
        group1.setStart(group.getStart());
        group1.setFinish(group.getFinish());
        session.merge(group1);
    }

    @Override
    public void clearGroup() {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("delete from Group ").executeUpdate();
    }
    // TODO: Student
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
}