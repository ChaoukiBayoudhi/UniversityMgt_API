package tn.esb.bis.UniversityMgt_API.Domains;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import tn.esb.bis.UniversityMgt_API.Enumerations.TeacherGrade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data //remplace @Getter, @Setter @RequiredArgsConstructor, @ToString et @EqualsAndHashCode
@NoArgsConstructor
@Entity
public class Teacher {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    private TeacherGrade grade;
    public Teacher(@NonNull String firstName, @NonNull String lastName, TeacherGrade grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
}
