package com.gestionappliance.getstionappliance.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Data
@Table
public class POV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPov;

    @ManyToOne
    @JoinColumn(name = "idAppliance")
    private Appliance idAppliance;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client idClient;

    private Date Date_Debut;
    private Date Date_Fin;
    private String Description;
    private String CompteManager;
    private String Ingenieur_CyberSecurite;
    private String Analyse_CyberSecurite;

    @OneToMany(mappedBy = "povSuivi", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Suivi> suivis;

    @OneToMany(mappedBy = "povSeance", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Seance> seances;
}
