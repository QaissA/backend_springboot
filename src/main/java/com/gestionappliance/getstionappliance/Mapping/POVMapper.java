package com.gestionappliance.getstionappliance.Mapping;

import com.gestionappliance.getstionappliance.Dto.ApplianceDTO;
import com.gestionappliance.getstionappliance.Dto.POVDTO;
import com.gestionappliance.getstionappliance.Model.POV;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface POVMapper {

    POVDTO POVToPOVDTO(POV pov);
    List<POVDTO> POVsToPOVDTOs(List<POV> pov);
    POV POVDTOToPOV(POVDTO povdto);
    List<POV> POVDTOsToPOVs(List<POVDTO> povdto);
}
