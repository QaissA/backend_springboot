package com.gestionappliance.getstionappliance.Mapping;

import com.gestionappliance.getstionappliance.Dto.TypeDTO;
import com.gestionappliance.getstionappliance.Model.Type;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TypeMapper {

    TypeDTO TypeToTypeDTO(Type type);
    List<TypeDTO> TypesToTypeDTOs(List<Type> type);

    Type TypeDTOToType(TypeDTO typeDTO);
    List<Type> TypeDTOsToTypes(List<TypeDTO> typeDTO);
}
