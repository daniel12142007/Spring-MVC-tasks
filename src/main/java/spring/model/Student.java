package spring.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
//@Table(name = "student")
@Setter
@Getter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "names")
    private String names;
    @Column(name = "age")
    private int age;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    private Course course;

    public Student(String names, int age) {
        this.names = names;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
               "id->" + id +
               ", names->'" + names + '\'' +
               ", age->" + age +
//               ", course=" + course +
               '}';
    }
}
