package com.gestionappliance.getstionappliance.Service;

import com.gestionappliance.getstionappliance.Dto.SuiviDTO;

import java.util.List;

public interface SuiviService {

    SuiviDTO save(SuiviDTO suiviDTO);

    void delete(Long idSuivi);

    List<SuiviDTO> findAllSuivi();

    SuiviDTO updateSuivi(long id, SuiviDTO suiviDTO);
}
