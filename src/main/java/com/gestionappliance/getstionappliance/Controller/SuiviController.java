package com.gestionappliance.getstionappliance.Controller;

import com.gestionappliance.getstionappliance.Dto.SuiviDTO;
import com.gestionappliance.getstionappliance.Service.SuiviService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/suivi")
public class SuiviController {

    @Autowired
    SuiviService suiviService;


    @PostMapping("/add")
    public SuiviDTO addSuivi(@RequestBody SuiviDTO suiviDTO) {
        return suiviService.save(suiviDTO);
    }

    @GetMapping("/all")
    public List<SuiviDTO> getAllSuivi() {
        return suiviService.findAllSuivi();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSuivi(@PathVariable("id") Long id) {
        suiviService.delete(id);
    }

    @PutMapping("/update/{id}")
    public SuiviDTO updateSuivi(@PathVariable("id") Long id,@RequestBody SuiviDTO suiviDTO) {
        return suiviService.updateSuivi(id, suiviDTO);
    }
}
