package tn.esb.bis.UniversityMgt_API.Domains;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import tn.esb.bis.UniversityMgt_API.Enumerations.studyLevel;

import javax.persistence.*;
import java.time.LocalDate;

@Getter //permet de generer tous les getters pour tous les attributs
@Setter //de même pour generer les setters
@NoArgsConstructor
@RequiredArgsConstructor
//@AllArgsConstructor //permet de generer un constructeur avec tous les paramètres
//@ToString //redefinition de toString() retournant une chaine de caractère contenant les valeurs de tous les attributs
//@ToString(exclude={"photo","email"})
@ToString(exclude="photo")//retourne une chaine avec les valeurs de tous les attributs sauf photo

@Entity //la classe Student sera transformée en une table relationnelle par L'ORM
//ORM : Object Relational Mapper
//L'ORM dans le cas de spring-boot est Hibernate
@Table(name="student_tab") //cette annotation permet de specifier quelques caractéristiques
//sur la table à créer par l'ORM
public class Student {
    @Id //primary key
    @GeneratedValue //La clé primaire sera automatiquement générée (par default identity)
    //une identité commence à partir  de 1 et sera incrémentée à chaque fois de 1
    private Long id;
    @NonNull //firstName est obligatoire
    @Column(name ="first_name",length=50)
    private String firstName;
    @NonNull
    @Column(name ="last_name",length=50)
    private String lastName;
    @JsonFormat(pattern="yyyy-mm-dd")
    private LocalDate birthDate;
    private studyLevel studentLevel;
    @NonNull
    @Column(unique=true,length=150)
    private String email;
    @Lob
    private byte[] photo;

    public Student(@NonNull String firstName, @NonNull String lastName, LocalDate birthDate, studyLevel studentLevel, @NonNull String email, byte[] photo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.studentLevel = studentLevel;
        this.email = email;
        this.photo = photo;
    }
}
