package com.gestionappliance.getstionappliance.Service;

import com.gestionappliance.getstionappliance.Dto.ContactDTO;

import java.util.List;

public interface ContactService {
    ContactDTO save(ContactDTO contactDTO);

    void delete(Long idContact);

    List<ContactDTO> findAllContact();

    ContactDTO updateContact(long id, ContactDTO contactDTO);
}
