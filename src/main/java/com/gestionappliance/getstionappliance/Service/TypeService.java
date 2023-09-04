package com.gestionappliance.getstionappliance.Service;

import com.gestionappliance.getstionappliance.Dto.TypeDTO;

import java.util.List;

public interface TypeService {

    TypeDTO save(TypeDTO typeDTO);

    void delete(Long idType);

    List<TypeDTO> findAllType();

    TypeDTO updateType(Long id,TypeDTO typeDTO);
}
