package spring.model.repository.interfaces;

import spring.model.Course;
import spring.model.Groups;

import java.util.List;
import java.util.Objects;

public interface Repositorys<Company, Course, Groups, Teacher, Student> {
    // TODO: Company
    List<Groups> findAllCompanyrelationShip(int id);

    List<Course> findAllCompanyrelationShipCourse(int id);

    List<Student> findAllCompanyrelationShipStudent(int id);

    List<Teacher> findAllCompanyrelationShipTeacher(int id);

    List<Company> findAllCompany();

    Company findByIdCompany(int id);

    void saveCompany(Company ompany);

    void deleteCompany(int id);

    void updateCompany(int id, Company company);

    void clearCompany();
// TODO: Course

    List<Course> findAllCourse();

    Course findByIdCourse(int id);

    void saveCourse(Course course);

    void deleteCourse(int id);

    void updateCourse(int id, Course course);

    void clearCourse();

    // TODO: Groups

    List<spring.model.Groups> findAllGroup();

    spring.model.Groups findByidGroup(int id);

    void saveGroup(spring.model.Groups groups);

    void deleteGroup(int id);

    void updateGroup(int id, spring.model.Groups groups);

    void clearGroup();

    // TODO: Teacher
    List<Teacher> findAllTeacher();

    Teacher findByidTeacher(int id);

    void saveTeacher(Teacher teacher);

    void deleteTeacher(int id);

    void updateTeacher(int id, Teacher teacher);

    void clearTeacher();

    // TODO: Student
    List<Student> findAllStudent();

    Student findByidStudent(int id);

    void saveStudent(Student student);

    void deleteStudent(int id);

    void updateStudent(int id, Student student);

    void clearStudent();
}