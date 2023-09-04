package com.gestionappliance.getstionappliance.Dto;

import jakarta.persistence.Entity;
import lombok.*;


@Data
@Builder
public class ClientDTO {
    public Long idClient;
    public  String libelle;
    public  String secteur;
    public String activite;

}
