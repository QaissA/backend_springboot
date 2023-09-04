package com.gestionappliance.getstionappliance.Controller;

import com.gestionappliance.getstionappliance.Dto.SeanceDTO;
import com.gestionappliance.getstionappliance.Service.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/seance")
public class SeanceController {

    @Autowired
    SeanceService seanceService;


    @PostMapping("/add")
    public SeanceDTO addSeance(@RequestBody SeanceDTO seanceDTO) {
        return seanceService.save(seanceDTO);
    }

    @GetMapping("/all")
    public List<SeanceDTO> findAllSeance() {
        return seanceService.findAllSeance();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSeance(@PathVariable("id") Long id) {
        seanceService.delete(id);
    }

    @PutMapping("/update/{id}")
    public SeanceDTO updateSeance(@PathVariable("id") Long id,@RequestBody   SeanceDTO seanceDTO) {
        return seanceService.updateSeance(id, seanceDTO)    ;
    }
}
