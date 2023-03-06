package spring.model.repository.interfaces;

public interface Repository<P, C, S, G, S1> {

    void saveCompany(P t);

    void saveCourse(C c);

    void saveTeacher(S s);
}
