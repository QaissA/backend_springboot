package com.gestionappliance.getstionappliance.Controller;

import com.gestionappliance.getstionappliance.Dto.ApplianceDTO;
import com.gestionappliance.getstionappliance.Repository.ApplianceRepo;
import com.gestionappliance.getstionappliance.Service.ApplianceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appliance")
public class ApplianceController {
    @Autowired
    private ApplianceService applianceService;




    @PostMapping("/add")
    public ApplianceDTO addAppliance(@RequestBody ApplianceDTO applianceDTO) {
        return applianceService.save(applianceDTO);
    }

    @GetMapping("/Find")
    public List<ApplianceDTO> getAllAppliance() {
        return applianceService.findAllAplliance();
    }

    @DeleteMapping("/Delete/{id}")
    public void DeleteAppliance(@PathVariable("id") Long idAppliance) {
         applianceService.delete(idAppliance);
    }

    @PutMapping("/Update/{id}")
    public ApplianceDTO updateAppliance(@PathVariable("id") Long id, @RequestBody ApplianceDTO applianceDTO) {
        return  applianceService.UpdateAppliance(id, applianceDTO);
    }
}
