package spring.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
//@Table(name = "course")
@Setter
@Getter
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "names")
    private String names;
    @Column(name = "age")
    private int age;
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Student> students;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "president_id")
    private President president;

    public Course(String names, int age) {
        this.names = names;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Course{" +
               "id->" + id +
               ", names->'" + names + '\'' +
               ", age->" + age +
//               ", students=" + students +
//               ", president=" + president +
               '}';
    }
}
