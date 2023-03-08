package spring.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "courName")
    private String courName;
    @Column(name = "duration")
    private String duration;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
    @OneToOne(mappedBy = "course", cascade = CascadeType.ALL)
    private Teacher teacher;
    @ManyToMany( cascade = CascadeType.ALL)
    @JoinTable(
            name = "group_courses",
            joinColumns = {@JoinColumn(name = "group_id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id")}
    )
    private List<Course> courses;
    public Course(String courName, String duration) {
        this.courName = courName;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
               "id=" + id +
               ", courName='" + courName + '\'' +
               ", duration=" + duration +
//               ", company=" + company +
               '}';
    }
}