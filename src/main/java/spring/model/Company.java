package spring.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "companyName")
    private String companyName;
    @Column(name = "country")
    private String country;
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<Course> courses;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<Group> groups;


    public Company(String companyName, String country) {
        this.companyName = companyName;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Company{" +
               "id->" + id +
               ", companyName->'" + companyName + '\'' +
               ", country->'" + country + '\'' +
               '}';
    }
}
