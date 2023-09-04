package com.gestionappliance.getstionappliance.Service.ServiceImp;

import com.gestionappliance.getstionappliance.Dto.ApplianceDTO;
import com.gestionappliance.getstionappliance.Mapping.ApplianceMapper;
import com.gestionappliance.getstionappliance.Repository.ApplianceRepo;
import com.gestionappliance.getstionappliance.Service.ApplianceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplianceServiceImp implements ApplianceService {

    @Autowired
    ApplianceRepo applianceRepo;
    @Autowired
    ApplianceMapper applianceMapper;

    @Override
    public ApplianceDTO save(ApplianceDTO appliancedto) {
        return applianceMapper.ApplianceToApplianceDTO(applianceRepo.save(applianceMapper.ApplianceDTOToAppliance(appliancedto)));
    }

    @Override
    public void delete(long idAppliance) {
        boolean exists = applianceRepo.existsById(idAppliance);
        if(!exists) {
            throw new IllegalStateException("type with Id" +idAppliance+ "does not exists");
        }

        applianceRepo.deleteById(idAppliance);

    }

    @Override
    public List<ApplianceDTO> findAllAplliance() {
        return applianceMapper.AppliancesToApplianceDTOs(applianceRepo.findAll());
    }

    @Override
    public ApplianceDTO UpdateAppliance(long id, ApplianceDTO appliancedto) {
        boolean exists = applianceRepo.existsById(id);
        if(!exists){
            throw  new IllegalStateException("the appliance with id"+ id + "does not exists");
        }

        appliancedto.setIdAppliance(id);
        applianceRepo.save(applianceMapper.ApplianceDTOToAppliance(appliancedto));
        return appliancedto;
    }
}
