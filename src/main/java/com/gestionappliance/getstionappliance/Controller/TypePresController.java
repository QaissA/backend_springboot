package com.gestionappliance.getstionappliance.Controller;


import com.gestionappliance.getstionappliance.Dto.TypePrestationDTO;
import com.gestionappliance.getstionappliance.Service.TypePrestationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/typePrestation")
public class TypePresController {

    @Autowired
    TypePrestationService typePrestationService;

    @PostMapping("/add")
    public TypePrestationDTO addTypePres(@RequestBody TypePrestationDTO typePrestationDTO) {
        return  typePrestationService.save(typePrestationDTO);
    }

    @GetMapping("/all")
    public List<TypePrestationDTO> getAllTypePres() {
        return typePrestationService.FindAllTypePres();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTypePres(@PathVariable("id") Long id) {
        typePrestationService.delete(id);
    }

    @PutMapping("/update/{id}")
    public TypePrestationDTO updateTypePres(@PathVariable("id") Long id, @RequestBody TypePrestationDTO typePrestationDTO) {
        return typePrestationService.updateTypePres(id, typePrestationDTO);
    }

}
