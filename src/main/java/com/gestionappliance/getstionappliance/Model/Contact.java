package com.gestionappliance.getstionappliance.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Data
@Table
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idContact;
    private String Nom;
    private String Prenom;
    private  String Telephone;
    private String Fonction;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client idClient;

    private String Email;
}
