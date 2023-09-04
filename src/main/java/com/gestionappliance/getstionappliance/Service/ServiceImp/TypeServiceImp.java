package com.gestionappliance.getstionappliance.Service.ServiceImp;

import com.gestionappliance.getstionappliance.Dto.TypeDTO;
import com.gestionappliance.getstionappliance.Mapping.TypeMapper;
import com.gestionappliance.getstionappliance.Repository.TypeRepo;
import com.gestionappliance.getstionappliance.Service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImp implements TypeService {

    @Autowired
    TypeRepo typeRepo;
    @Autowired
    TypeMapper typeMapper;
    @Override
    public TypeDTO save(TypeDTO typeDTO) {
        return typeMapper.TypeToTypeDTO(typeRepo.save(typeMapper.TypeDTOToType(typeDTO)));
    }

    @Override
    public void delete(Long idType) {
        boolean exists = typeRepo.existsById(idType);
        if(!exists) {
            throw new IllegalStateException("Type doesn not exists");
        }

        typeRepo.deleteById(idType);
    }

    @Override
    public List<TypeDTO> findAllType() {
        return typeMapper.TypesToTypeDTOs(typeRepo.findAll());
    }

    @Override
    public TypeDTO updateType(Long id, TypeDTO typeDTO) {
        boolean exists = typeRepo.existsById(id);
        if(!exists) {
            throw new IllegalStateException("Type doesn not exists");
        }

        typeDTO.setIdType(id);
        typeRepo.save(typeMapper.TypeDTOToType(typeDTO));
        return null;
    }
}
