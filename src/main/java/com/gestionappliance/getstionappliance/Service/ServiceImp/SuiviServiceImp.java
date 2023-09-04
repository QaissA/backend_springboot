package com.gestionappliance.getstionappliance.Service.ServiceImp;

import com.gestionappliance.getstionappliance.Dto.SuiviDTO;
import com.gestionappliance.getstionappliance.Mapping.SuiviMapper;
import com.gestionappliance.getstionappliance.Repository.SuiviRepo;
import com.gestionappliance.getstionappliance.Service.SuiviService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuiviServiceImp implements SuiviService {

    @Autowired
    SuiviRepo suiviRepo;
    @Autowired
    SuiviMapper suiviMapper;


    @Override
    public SuiviDTO save(SuiviDTO suiviDTO) {
        return suiviMapper.SuiviToSuiviDTO(suiviRepo.save(suiviMapper.SuiviDTOToSuivi(suiviDTO)));
    }

    @Override
    public void delete(Long idSuivi) {
        boolean exists = suiviRepo.existsById(idSuivi);
        if(!exists) {
            throw new IllegalStateException("Suivi does Not exists");
        }

        suiviRepo.deleteById(idSuivi);

    }

    @Override
    public List<SuiviDTO> findAllSuivi() {
        return suiviMapper.SuivisToSuiviDTOs(suiviRepo.findAll());
    }

    @Override
    public SuiviDTO updateSuivi(long id, SuiviDTO suiviDTO) {
        boolean exists = suiviRepo.existsById(id);

        if(!exists) {
            throw new IllegalStateException("Suivi does not exists");
        }

        suiviDTO.setIdSuivi(id);
        suiviRepo.save(suiviMapper.SuiviDTOToSuivi(suiviDTO));
        return suiviDTO;
    }
}
