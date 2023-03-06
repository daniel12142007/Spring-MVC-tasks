package spring.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firts_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "email")
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    private Course course;

    public Teacher( String firts_name, String last_name, String email) {
        this.firts_name = firts_name;
        this.last_name = last_name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Teacher{" +
               "id->" + id +
               ", firts_name->'" + firts_name + '\'' +
               ", last_name->'" + last_name + '\'' +
               ", email->'" + email + '\'' +
               '}';
    }
}
