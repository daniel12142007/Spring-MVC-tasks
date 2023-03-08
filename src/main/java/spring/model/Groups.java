package spring.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Groups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "groupName")
    private String groupName;
    @Column(name = "dataStart")
    private String dataStart;
    @Column(name = "dataFinish")
    private String dataFinish;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private List<Student> students;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Course> courses;

    public Groups(String groupName, String dataStart, String dataFinish) {
        this.groupName = groupName;
        this.dataStart = dataStart;
        this.dataFinish = dataFinish;
    }

    @Override
    public String toString() {
        return "Groups{" +
               "id=" + id +
               ", groupName='" + groupName + '\'' +
               ", dataStart='" + dataStart + '\'' +
               ", dataFinish='" + dataFinish + '\'' +
//               ", company=" + company +
               '}';
    }
}