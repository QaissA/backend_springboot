package com.gestionappliance.getstionappliance.Dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Data
public class SeanceDTO {
    public Long idSeance;
    public Date DateSceance;
    public String Resumer;
    public String Participant;
    public POVDTO povSeance;

}
