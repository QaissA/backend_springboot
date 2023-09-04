package com.gestionappliance.getstionappliance.Service.ServiceImp;

import com.gestionappliance.getstionappliance.Dto.TypePrestationDTO;
import com.gestionappliance.getstionappliance.Mapping.TypePrestationMapper;
import com.gestionappliance.getstionappliance.Repository.TypePrestationRepo;
import com.gestionappliance.getstionappliance.Service.TypePrestationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypePrestationServiceImp implements TypePrestationService {

    @Autowired
    TypePrestationRepo typePrestationRepo;
    @Autowired
    TypePrestationMapper typePrestationMapper;


    @Override
    public TypePrestationDTO save(TypePrestationDTO typePrestationDTO) {
        return typePrestationMapper.TypePresToTypePresDTO(typePrestationRepo.save(typePrestationMapper.TypePresDTOToTypePres(typePrestationDTO)));
    }

    @Override
    public void delete(Long idTypePres) {
        boolean exists = typePrestationRepo.existsById(idTypePres);
        if(!exists) {
            throw new IllegalStateException("type de prestation does not exists");
        }

        typePrestationRepo.deleteById(idTypePres);
    }

    @Override
    public List<TypePrestationDTO> FindAllTypePres() {
        return typePrestationMapper.TypePressToTypePresDTOs(typePrestationRepo.findAll());
    }

    @Override
    public TypePrestationDTO updateTypePres(Long id, TypePrestationDTO typePrestationDTO) {
        boolean exists = typePrestationRepo.existsById(id);
        if(!exists) {
            throw new IllegalStateException("type de prestation does not exists");
        }
        typePrestationDTO.setIdTypePres(id);
        typePrestationRepo.save(typePrestationMapper.TypePresDTOToTypePres(typePrestationDTO));
        return typePrestationDTO;
    }
}
