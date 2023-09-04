package com.gestionappliance.getstionappliance.Service;

import com.gestionappliance.getstionappliance.Dto.ApplianceDTO;

import java.util.List;

public interface ApplianceService {

    ApplianceDTO save(ApplianceDTO appliancedto);
    void delete(long idAppliance);

    List<ApplianceDTO> findAllAplliance();
    ApplianceDTO UpdateAppliance(long id, ApplianceDTO appliancedto);



}
