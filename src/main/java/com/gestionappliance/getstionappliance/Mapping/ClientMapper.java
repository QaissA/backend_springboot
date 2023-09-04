package com.gestionappliance.getstionappliance.Mapping;

import com.gestionappliance.getstionappliance.Dto.ClientDTO;
import com.gestionappliance.getstionappliance.Model.Client;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    ClientDTO clientToClientDTO(Client client);
    List<ClientDTO> ClientsToClientDTOs(List<Client> clients);
    Client clientDTOToClient(ClientDTO clientDTO);
    List<Client> ClientDTOsToClients(List<ClientDTO> clients);
}
