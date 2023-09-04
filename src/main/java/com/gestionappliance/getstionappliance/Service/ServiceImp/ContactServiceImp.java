package com.gestionappliance.getstionappliance.Service.ServiceImp;

import com.gestionappliance.getstionappliance.Dto.ContactDTO;
import com.gestionappliance.getstionappliance.Mapping.ContactMapper;
import com.gestionappliance.getstionappliance.Repository.ContactRepo;
import com.gestionappliance.getstionappliance.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImp implements ContactService {

    @Autowired
    ContactRepo contactRepo;
    @Autowired
    ContactMapper contactMapper;
    @Override
    public ContactDTO save(ContactDTO contactDTO) {
        return contactMapper.contactToContactDTO(contactRepo.save(contactMapper.contactDTOtoContact(contactDTO)));
    }

    @Override
    public void delete(Long idContact) {
        boolean exists = contactRepo.existsById(idContact);
        if(!exists) {
            throw  new IllegalStateException("Contact does not exists");
        }

        contactRepo.deleteById(idContact);

    }

    @Override
    public List<ContactDTO> findAllContact() {
        return contactMapper.contactsToContactDTOs(contactRepo.findAll());
    }

    @Override
    public ContactDTO updateContact(long id, ContactDTO contactDTO) {
        boolean exists = contactRepo.existsById(id);

        if(!exists) {
            throw  new IllegalStateException("Contact does not exists");
        }

        contactDTO.setIdContact(id);
        contactRepo.save(contactMapper.contactDTOtoContact(contactDTO));
        return contactDTO;
    }
}
