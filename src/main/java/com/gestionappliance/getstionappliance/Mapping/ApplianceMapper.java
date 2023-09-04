package com.gestionappliance.getstionappliance.Mapping;

import com.gestionappliance.getstionappliance.Dto.ApplianceDTO;
import com.gestionappliance.getstionappliance.Model.Appliance;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ApplianceMapper {
    ApplianceDTO ApplianceToApplianceDTO(Appliance appliance);
    List<ApplianceDTO> AppliancesToApplianceDTOs(List<Appliance> appliances);
    Appliance ApplianceDTOToAppliance(ApplianceDTO applianceDto);
    List<Appliance> ApplianceDTOsToAppliances(List<ApplianceDTO> applianceDTOs);
}
