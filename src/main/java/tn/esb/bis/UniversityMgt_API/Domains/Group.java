package tn.esb.bis.UniversityMgt_API.Domains;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Group {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private int capacity;
    private String description;

    public Group(@NonNull String name, @NonNull int capacity, String description) {
        this.name = name;
        this.capacity = capacity;
        this.description = description;
    }
    @ManyToMany
    //La création de la table association avec @JoinTable est valable uniquement
    //lorsque la table association contient uniquement les deux clés étrangères
    //formant une clé primaire composite.
    @JoinTable(name="Group_Modules",
            joinColumns=@JoinColumn(name ="id_group",referencedColumnName = "id"),
            inverseJoinColumns=@JoinColumn(name ="id_module",referencedColumnName="id")
            //les deux clés étrangères formant la clé primaire composite
    )
    private Set<Module> modules = new HashSet<>();
    @OneToMany(mappedBy="studentGroup",cascade=CascadeType.ALL)
    private Set<Student> students = new HashSet<>();
}
