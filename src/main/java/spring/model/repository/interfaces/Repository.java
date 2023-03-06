package spring.model.repository.interfaces;

public interface Repository<P, C, S> {

    void savePresident(P t);

    void saveCourse(C c);

    void saveStudent(S s);
}
