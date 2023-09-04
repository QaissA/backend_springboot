package com.gestionappliance.getstionappliance.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Data
@Table
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idSeance;
    private Date dateSeance;
    private String Resume;
    private String Participant;

    @ManyToOne
    @JoinColumn(name = "idPov")
    private POV povSeance;
}
