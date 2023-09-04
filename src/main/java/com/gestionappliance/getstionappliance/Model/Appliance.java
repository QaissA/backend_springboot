package com.gestionappliance.getstionappliance.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Data
@Table
public class Appliance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAppliance;
    private String Libelle;

    @ManyToOne
    @JoinColumn(name = "idType")
    @Enumerated
    private Type idType;

    private String DBID;
    private Boolean Disponibilite;
    private String References;

    @OneToMany(mappedBy = "idAppliance", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private  List<POV> POV;

}
