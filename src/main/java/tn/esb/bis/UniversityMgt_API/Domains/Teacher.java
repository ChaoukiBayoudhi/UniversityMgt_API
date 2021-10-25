package tn.esb.bis.UniversityMgt_API.Domains;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import tn.esb.bis.UniversityMgt_API.Enumerations.TeacherGrade;
import tn.esb.bis.UniversityMgt_API.Enumerations.studyLevel;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data //remplace @Getter, @Setter @RequiredArgsConstructor, @ToString et @EqualsAndHashCode
@NoArgsConstructor
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
