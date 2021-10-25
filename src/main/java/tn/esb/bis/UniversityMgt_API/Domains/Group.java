package tn.esb.bis.UniversityMgt_API.Domains;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

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
//    @ManyToMany
//    @JoinTable(name="GroupModule",
//            //les deux clés étrangères formant la clé primaire composite
//    )
}
