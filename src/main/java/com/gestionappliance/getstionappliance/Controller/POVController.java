package com.gestionappliance.getstionappliance.Controller;

import com.gestionappliance.getstionappliance.Dto.POVDTO;
import com.gestionappliance.getstionappliance.Model.POV;
import com.gestionappliance.getstionappliance.Service.POVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pov")
public class POVController {

    @Autowired
    POVService povService;


    @PostMapping("/add")
    public POVDTO addPOV(@RequestBody POVDTO povdto) {
        return povService.save(povdto);
    }

    @GetMapping("/all")
    public List<POVDTO> getAllPOV() {
        return povService.findAllPOV();
    }

    @DeleteMapping("/delete/{id}")
    public void deletePOV(@PathVariable("id") Long id) {
        povService.delete(id);
    }

    @PostMapping("/update/{id}")
    public POVDTO updatePOV(@PathVariable("id") Long id,@RequestBody POVDTO povdto) {
        return povService.updatePOV(id, povdto);
    }
}
