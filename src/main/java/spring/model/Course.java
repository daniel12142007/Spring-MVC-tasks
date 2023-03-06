package spring.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "course")
@Setter
@Getter
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "courName")
    private String courName;
    @Column(name = "year")
    private int year;
    @ManyToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Group> groups;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id")
    private Company company;
    @OneToOne(mappedBy = "course", cascade = CascadeType.ALL)
    private Teacher teacher;


    public Course(String courName, int year) {
        this.courName = courName;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Course{" +
               "id->" + id +
               ", courseName->'" + courName + '\'' +
               ", year->" + year +
               '}';
    }
}
