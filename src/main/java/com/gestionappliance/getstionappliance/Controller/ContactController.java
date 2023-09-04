package com.gestionappliance.getstionappliance.Controller;

import com.gestionappliance.getstionappliance.Dto.ContactDTO;
import com.gestionappliance.getstionappliance.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contact")
public class ContactController {

    @Autowired
    ContactService contactService;


    @PostMapping("/add")
    public ContactDTO addContact(@RequestBody ContactDTO contactDTO) {
        return contactService.save(contactDTO);
    }

    @GetMapping("/all")
    public List<ContactDTO> getAllContact() {
        return contactService.findAllContact();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContact(@PathVariable("id") Long id) {
        contactService.delete(id);
    }

    @PutMapping("/update/{id}")
    public ContactDTO updateContact(@PathVariable("id") Long id, @RequestBody ContactDTO contactDTO) {
        return contactService.updateContact(id, contactDTO);
    }
}
