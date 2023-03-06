package spring.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
//@Table(name = "president")
@Getter
@Setter
@NoArgsConstructor
public class President {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "names")
    private String names;
    @Column(name = "age")
    private int age;
    @OneToMany(mappedBy = "president", cascade = CascadeType.ALL)
    private List<Course> courses;

    public President(String names, int age) {
        this.names = names;
        this.age = age;
    }

    @Override
    public String toString() {
        return "President{" +
               "id->" + id +
               ", names->'" + names + '\'' +
               ", age->" + age +
//               ", courses=" + courses +
               '}';
    }
}
