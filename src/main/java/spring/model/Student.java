package spring.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fisrt_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "email")
    private String email;
    @Column(name = "studyFormat")
    private StudentFormat studentFormat;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "group_id")
//    private Group group;

    public Student(String first_name, String last_name, String email, StudentFormat studentFormat) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.studentFormat = studentFormat;
    }

    @Override
    public String toString() {
        return "Student{" +
               "id->" + id +
               ", first_name->'" + first_name + '\'' +
               ", last_name->'" + last_name + '\'' +
               ", email->'" + email + '\'' +
               ", studentFormat->" + studentFormat +
               '}';
    }
}
