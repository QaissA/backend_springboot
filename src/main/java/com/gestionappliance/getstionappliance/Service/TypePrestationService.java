package com.gestionappliance.getstionappliance.Service;

import com.gestionappliance.getstionappliance.Dto.TypePrestationDTO;

import java.util.List;

public interface TypePrestationService {

    TypePrestationDTO save(TypePrestationDTO typePrestationDTO);
    void delete(Long idTypePres);
    List<TypePrestationDTO> FindAllTypePres();
    TypePrestationDTO updateTypePres(Long id, TypePrestationDTO typePrestationDTO);
}
