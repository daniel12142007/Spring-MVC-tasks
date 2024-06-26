package spring.model;

import lombok.*;

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
    @ManyToMany(
            mappedBy = "courses",
            cascade = CascadeType.ALL)
    private List<Groups> groups;

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
               '}';
    }
}