package tn.esb.bis.UniversityMgt_API.Domains;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    @EqualsAndHashCode.Include
    private int houseNumber;
    @NonNull
    @EqualsAndHashCode.Include
    private String street;
    @NonNull
    @EqualsAndHashCode.Include
    private  int postalCode;


}
