package com.gestionappliance.getstionappliance.Mapping;

import com.gestionappliance.getstionappliance.Dto.TypePrestationDTO;
import com.gestionappliance.getstionappliance.Model.TypePrestation;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TypePrestationMapper {

    TypePrestationDTO TypePresToTypePresDTO(TypePrestation typePrestation);
    List<TypePrestationDTO> TypePressToTypePresDTOs(List<TypePrestation> typePrestation);

    TypePrestation TypePresDTOToTypePres(TypePrestationDTO typePrestationDTO);

    List<TypePrestation> TypePresDTOsToTypePress(List<TypePrestationDTO> typePrestationDTO);
}
