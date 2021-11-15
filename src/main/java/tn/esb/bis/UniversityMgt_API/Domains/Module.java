package tn.esb.bis.UniversityMgt_API.Domains;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import tn.esb.bis.UniversityMgt_API.Enumerations.studyLevel;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data //remplace @Getter, @Setter @RequiredArgsConstructor, @ToString et @EqualsAndHashCode
@NoArgsConstructor
@RequiredArgsConstructor //genère un con structeur avec uniquement les attributs
//obligatoires (annotés avec @NonNull de Lombok)
@Entity
public class Module {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private int nbHours;
    @NonNull
    private studyLevel Level;
    @ManyToMany
    Set<Group> groupes=new HashSet<>();
}
