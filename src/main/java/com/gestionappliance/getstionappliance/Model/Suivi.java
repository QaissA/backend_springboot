package com.gestionappliance.getstionappliance.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Data
@Table
public class Suivi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSuivi;
    private boolean OffreCommercial;
    private float Montant;

    @ManyToOne
    @JoinColumn(name = "TypePres")
    private TypePrestation TypePres;

    private String CompteRendu;

    @ManyToOne
    @JoinColumn(name = "idPov")
    private POV povSuivi;
}
