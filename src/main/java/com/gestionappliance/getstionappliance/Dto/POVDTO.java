package com.gestionappliance.getstionappliance.Dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Data

public class POVDTO {
    public Long idPov;
    public ApplianceDTO idAppliance;
    public ClientDTO idClient;
    public Date Date_Debut;
    public Date Date_Fin;
    public String Description;
    public String CompteManager;
    public String Ingenieur_CyberSecurite;
    public String Analyse_CyberSecurite;
    public String Libelle_Pov;
}
