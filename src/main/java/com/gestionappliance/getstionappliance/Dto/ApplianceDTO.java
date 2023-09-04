package com.gestionappliance.getstionappliance.Dto;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Data

public class ApplianceDTO {
    public Long idAppliance;
    public  String Libelle;
    public TypeDTO idType; //FK_TYPE
    public String DBID;
    public Boolean Disponibilitte;
    public String References;
}
