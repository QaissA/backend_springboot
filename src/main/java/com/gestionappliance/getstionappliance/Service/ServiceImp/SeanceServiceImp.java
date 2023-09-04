package com.gestionappliance.getstionappliance.Service.ServiceImp;

import com.gestionappliance.getstionappliance.Dto.SeanceDTO;
import com.gestionappliance.getstionappliance.Mapping.SeanceMapper;
import com.gestionappliance.getstionappliance.Repository.SeanceRepo;
import com.gestionappliance.getstionappliance.Service.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeanceServiceImp implements SeanceService {

    @Autowired
    SeanceRepo seanceRepo;
    @Autowired
    SeanceMapper seanceMapper;


    @Override
    public SeanceDTO save(SeanceDTO seanceDTO) {
        return seanceMapper.SeanceToSeanceDTO(seanceRepo.save(seanceMapper.SeanceDTOToSeance(seanceDTO)));
    }

    @Override
    public void delete(Long idSeance) {
        boolean exists = seanceRepo.existsById(idSeance);
        if(!exists) {
            throw new IllegalStateException("Seance does not exists");
        }

        seanceRepo.deleteById(idSeance);
    }

    @Override
    public List<SeanceDTO> findAllSeance() {
        return seanceMapper.SeancesToSeanceDTOs(seanceRepo.findAll());
    }

    @Override
    public SeanceDTO updateSeance(long id, SeanceDTO seanceDTO) {
        boolean exists = seanceRepo.existsById(id);
        if(!exists) {
            throw new IllegalStateException("Seance does not exists");
        }

        seanceDTO.setIdSeance(id);
        seanceRepo.save(seanceMapper.SeanceDTOToSeance(seanceDTO));
        return seanceDTO;
    }
}
