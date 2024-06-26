package spring.model;

import lombok.*;
import spring.model.enums.Studentforms;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "email")
    private String email;
    @Column(name = "studentFormat")
    @Enumerated(EnumType.STRING)
    private Studentforms studentforms;
    @ManyToOne
    @JoinColumn(name = "groups_id")
    private Groups group;

    public Student(String first_name, String last_name, String email, Studentforms studentforms) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.studentforms = studentforms;
    }

    @Override
    public String toString() {
        return "Student{" +
               "id=" + id +
               ", first_name='" + first_name + '\'' +
               ", last_name='" + last_name + '\'' +
               ", email='" + email + '\'' +
               ", studentforms=" + studentforms +
               '}';
    }
}
