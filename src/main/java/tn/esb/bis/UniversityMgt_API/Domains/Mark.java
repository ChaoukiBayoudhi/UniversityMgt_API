package tn.esb.bis.UniversityMgt_API.Domains;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
@Entity
public class Mark {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private float value;
    private String distinction;
    @NonNull
    private String justification;
}
