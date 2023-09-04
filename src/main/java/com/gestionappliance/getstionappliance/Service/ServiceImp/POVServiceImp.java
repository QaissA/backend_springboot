package com.gestionappliance.getstionappliance.Service.ServiceImp;

import com.gestionappliance.getstionappliance.Dto.POVDTO;
import com.gestionappliance.getstionappliance.Mapping.POVMapper;
import com.gestionappliance.getstionappliance.Repository.PovRepo;
import com.gestionappliance.getstionappliance.Service.POVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class POVServiceImp implements POVService {

    @Autowired
    PovRepo povrepo;

    @Autowired
    POVMapper povMapper;
    @Override
    public POVDTO save(POVDTO povdto) {
        return povMapper.POVToPOVDTO(povrepo.save(povMapper.POVDTOToPOV(povdto)));
    }

    @Override
    public void delete(Long IdPOV) {
        boolean exists = povrepo.existsById(IdPOV);
        if(!exists) {
            throw  new IllegalStateException("POV does not exists");
        }

        povrepo.deleteById(IdPOV);
    }

    @Override
    public List<POVDTO> findAllPOV() {
        return povMapper.POVsToPOVDTOs(povrepo.findAll());
    }

    @Override
    public POVDTO updatePOV(long id, POVDTO povdto) {
        boolean exists = povrepo.existsById(id);
        if(!exists) {
            throw new IllegalStateException("POV does not exists");
        }

        povdto.setIdPov(id);
        povrepo.save(povMapper.POVDTOToPOV(povdto));
        return povdto;
    }
}
