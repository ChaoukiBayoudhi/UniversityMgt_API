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
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//redefinit les méthodes equals() et hashCode de la classe Object
//dans ce cas deux étudiants sont identiques s'il y a egalité entre
//tous les champs annotés avec @EqualsAndHashCode.Include
public class Student {
    @Id //primary key
    @GeneratedValue //La clé primaire sera automatiquement générée (par default identity)
    //une identité commence à partir  de 1 et sera incrémentée à chaque fois de 1
    private Long id;
    @NonNull //firstName est obligatoire
    @Column(name ="first_name",length=50)
    @EqualsAndHashCode.Include
    private String firstName;
    @NonNull
    @Column(name ="last_name",length=50)
    @EqualsAndHashCode.Include
    private String lastName;
    @JsonFormat(pattern="yyyy-MM-dd")
    @EqualsAndHashCode.Include
    @NonNull
    private LocalDate birthDate;
    private studyLevel studentLevel;
    @NonNull
    @Column(unique=true,length=150)
    private String email;
    @Lob
    private byte[] photo;
    @ManyToOne
    @JoinColumn(name="id_group",referencedColumnName = "id")
    private Group studentGroup;
    @OneToOne(mappedBy="student",cascade=CascadeType.ALL)
    @JoinColumn(name="id_address",referencedColumnName="id")
    private Address studentAddress;

    public Student(Long id, @NonNull String firstName, @NonNull String lastName, LocalDate birthDate, studyLevel studentLevel, @NonNull String email, byte[] photo, Group studentGroup, Address studentAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.studentLevel = studentLevel;
        this.email = email;
        this.photo = photo;
        this.studentGroup = studentGroup;
        this.studentAddress = studentAddress;
    }
}
