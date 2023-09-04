package com.gestionappliance.getstionappliance.Controller;

import com.gestionappliance.getstionappliance.Dto.TypeDTO;
import com.gestionappliance.getstionappliance.Service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/type")
public class TypeController {

    @Autowired
    TypeService typeService;


    @PostMapping("/add")
    public TypeDTO addType(@RequestBody TypeDTO typeDTO) {
        return typeService.save(typeDTO);
    }

    @GetMapping("/all")
    public List<TypeDTO> getAllType() {
        return typeService.findAllType();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteType(@PathVariable("id") Long id) {
        typeService.delete(id);
    }

    @PutMapping("/update/{id}")
    public TypeDTO updateType(@PathVariable("id") Long id,@RequestBody TypeDTO typeDTO) {
        return typeService.updateType(id, typeDTO);
    }
}
