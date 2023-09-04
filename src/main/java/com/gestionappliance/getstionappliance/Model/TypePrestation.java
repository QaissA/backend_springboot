package com.gestionappliance.getstionappliance.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Data
@Table
public class TypePrestation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTypePres;
    private String Libelle;

    @OneToMany(mappedBy = "TypePres", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Suivi> suivis;
}
