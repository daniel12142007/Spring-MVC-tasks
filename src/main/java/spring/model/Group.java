package spring.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "group")
@Getter
@Setter
@NoArgsConstructor
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "groupName")
    private String groupName;
    @Column(name = "start")
    private int start;
    @Column(name = "finish")
    private int finish;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id")
    private Company company;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    private List<Course> course;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Student> student;

    public Group(String groupName, int start, int finish) {
        this.groupName = groupName;
        this.start = start;
        this.finish = finish;
    }

    @Override
    public String toString() {
        return "Group{" +
               "id->" + id +
               ", groupName->'" + groupName + '\'' +
               ", start->" + start +
               ", finish->" + finish +
               '}';
    }
}
