package com.gestionappliance.getstionappliance.Mapping;

import com.gestionappliance.getstionappliance.Dto.SuiviDTO;
import com.gestionappliance.getstionappliance.Model.Suivi;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SuiviMapper {
    SuiviDTO SuiviToSuiviDTO(Suivi suivi);
    List<SuiviDTO> SuivisToSuiviDTOs(List<Suivi> suivi);
    Suivi SuiviDTOToSuivi(SuiviDTO suiviDTO);
    List<Suivi> SuiviDTOsToSuivis(List<SuiviDTO> suiviDTO);
}
