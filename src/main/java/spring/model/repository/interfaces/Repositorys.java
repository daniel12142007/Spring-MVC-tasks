package spring.model.repository.interfaces;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

public interface Repositorys<Company, Course, Group, Teacher, Student> {
    // TODO: Company
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

    List<Group> findAllGroup();

    Group findByidGroup(int id);

    void saveGroup(Group group);

    void deleteGroup(int id);

    void updateGroup(int id, Group group);

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