package com.gestionappliance.getstionappliance.Mapping;

import com.gestionappliance.getstionappliance.Dto.SeanceDTO;
import com.gestionappliance.getstionappliance.Model.Seance;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SeanceMapper {

    SeanceDTO SeanceToSeanceDTO(Seance seance);
    List<SeanceDTO> SeancesToSeanceDTOs(List<Seance> seance);

    Seance SeanceDTOToSeance(SeanceDTO seanceDTO);
    List<Seance> SeanceDTOsToSeances(List<SeanceDTO> seanceDTO);
}
