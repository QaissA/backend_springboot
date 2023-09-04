package com.gestionappliance.getstionappliance.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Data
@Table
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idClient;
    private String libelle;
    private String secteur;
    private String activite;

    @OneToMany(mappedBy = "idClient", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Contact> Contact;

    @OneToMany(mappedBy = "idClient", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<POV> POV;

}
