package com.gestionappliance.getstionappliance.Mapping;

import com.gestionappliance.getstionappliance.Dto.ContactDTO;
import com.gestionappliance.getstionappliance.Model.Contact;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ContactMapper {
    ContactDTO contactToContactDTO(Contact contact);
    List<ContactDTO> contactsToContactDTOs(List<Contact> contacts);
    Contact contactDTOtoContact(ContactDTO contactDTO);
    List<Contact> contactDTOstoContacts(List<ContactDTO> contactDTO);
}
