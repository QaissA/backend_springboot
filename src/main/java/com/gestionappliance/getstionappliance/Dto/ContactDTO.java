package com.gestionappliance.getstionappliance.Dto;

import lombok.*;

@Getter
@Setter
@Data

public class ContactDTO {
    public Long idContact;
    public String Nom;
    public String Prenom;
    public String Telephone;
    public  String Fonction;
    public ClientDTO idClient;  //FK_KEY
    public  String Email;
}
