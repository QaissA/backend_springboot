package com.gestionappliance.getstionappliance.Dto;

import lombok.*;

@Getter
@Setter
@Data
public class SuiviDTO {
    public Long idSuivi;
    public Boolean OffreCommercial;
    public float   Montant;
    public TypePrestationDTO TypePres;
    public POVDTO povSuivi;
    public String CompteRendu;
}
