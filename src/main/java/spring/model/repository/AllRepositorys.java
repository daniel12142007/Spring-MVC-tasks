package spring.model.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.model.*;
import spring.model.repository.interfaces.Repositorys;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class AllRepositorys implements Repositorys<Company, Course, Groups, Teacher, Student> {
    @Autowired
    private SessionFactory sessionFactory;


    // TODO: Company
    @Override
    public List<Groups> findAllCompanyrelationShip(int id) {
//        Session session = sessionFactory.getCurrentSession();
        List<Groups> groups1 = new ArrayList<>();
        Company mainEntity = findByIdCompany(id);
        for (Groups group : findAllGroup()) {
            Groups groups = findByidGroup(group.getId());
            if (groups.getCompany().getId() == mainEntity.getId()) {
                groups1.add(groups);
            }
        }
        return groups1;
    }

    @Override
    public List<Course> findAllCompanyrelationShipCourse(int id) {
//        Session session = sessionFactory.getCurrentSession();
        List<Course> groups1 = new ArrayList<>();
        Company mainEntity = findByIdCompany(id);
        for (Course course : findAllCourse()) {
            Course groups = findByIdCourse(course.getId());
            if (groups.getCompany().getId() == mainEntity.getId()) {
                groups1.add(groups);
            }
        }
        return groups1;
    }

    @Override
    public List<Student> findAllCompanyrelationShipStudent(int id) {
        List<Student> groups1 = new ArrayList<>();
        Groups mainEntity = findByidGroup(id);
        for (Student group : findAllStudent()) {
            Student groups = findByidStudent(group.getId());
            if (groups.getGroup().getId() == mainEntity.getId()) {
                groups1.add(groups);
            }
        }
        return groups1;
    }

    @Override
    public List<Teacher> findAllCompanyrelationShipTeacher(int id) {
        List<Teacher> groups1 = new ArrayList<>();
        Course mainEntity = findByIdCourse(id);
        for (Teacher group : findAllTeacher()) {
            Teacher groups = findByidTeacher(group.getId());
            if (groups.getCourse().getId() == mainEntity.getId()) {
                groups1.add(groups);
            }
        }
        return groups1;
    }

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
        Company company = findByIdCompany(id);
        session.delete(company);
    }

    @Override
    public void updateCompany(int id, Company company) {
        Session session = sessionFactory.getCurrentSession();
        Company company1 = findByIdCompany(id);
        company1.setCompanyName(company.getCompanyName());
        company1.setLocatedCountry(company.getLocatedCountry());
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
//        session.beginTransaction();
        session.save(course);
//        session.getTransaction().commit();
    }

    @Override
    public void deleteCourse(int id) {
        Session session = sessionFactory.getCurrentSession();
        Course course = findByIdCourse(id);
        session.delete(course);
    }

    @Override
    public void updateCourse(int id, Course course) {
        Session session = sessionFactory.getCurrentSession();
        Course course1 = findByIdCourse(id);
        course1.setCourName(course.getCourName());
        course1.setDuration(course.getDuration());
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
        session.createQuery("delete from Teacher where id=" + id).executeUpdate();
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

    // TODO: Groups
    @Override
    public List<Groups> findAllGroup() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select g from Groups g", Groups.class).getResultList();
    }

    @Override
    public Groups findByidGroup(int id) {
        Session session = sessionFactory.getCurrentSession();
        try {
            return session.get(Groups.class, id);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void saveGroup(Groups group) {
        Session session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
        session.save(group);
//        session.getTransaction().commit();
    }

    @Override
    public void deleteGroup(int id) {
        Session session = sessionFactory.getCurrentSession();
        Groups group = findByidGroup(id);
        session.delete(group);
    }

    @Override
    public void updateGroup(int id, Groups group) {
        Session session = sessionFactory.getCurrentSession();
        Groups group1 = findByidGroup(id);
        group1.setGroupName(group.getGroupName());
        group1.setDataStart(group.getDataStart());
        group1.setDataFinish(group.getDataFinish());
        session.merge(group1);
    }

    @Override
    public void clearGroup() {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("delete from Groups ").executeUpdate();
    }

    // TODO: Student
    @Override
    public List<Student> findAllStudent() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select s from Student s", Student.class).getResultList();
    }

    @Override
    public Student findByidStudent(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Student.class, id);
    }

    @Override
    public void saveStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("delete from Student where id=" + id).executeUpdate();
    }

    @Override
    public void updateStudent(int id, Student student) {
        Session session = sessionFactory.getCurrentSession();
        Student student1 = findByidStudent(id);
        student1.setFirst_name(student.getFirst_name());
        student1.setLast_name(student.getLast_name());
        student1.setEmail(student.getEmail());
        student1.setStudentforms(student.getStudentforms());
        session.merge(student1);
    }

    @Override
    public void clearStudent() {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("delete from Student ").executeUpdate();
    }
}