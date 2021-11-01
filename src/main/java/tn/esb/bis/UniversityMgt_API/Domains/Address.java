package tn.esb.bis.UniversityMgt_API.Domains;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private int houseNumber;
    @NonNull
    private String street;
    @NonNull
    private  int postalCode;
}
