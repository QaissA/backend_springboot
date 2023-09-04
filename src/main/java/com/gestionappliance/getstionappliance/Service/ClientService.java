package com.gestionappliance.getstionappliance.Service;

import com.gestionappliance.getstionappliance.Dto.ApplianceDTO;
import com.gestionappliance.getstionappliance.Dto.ClientDTO;

import java.util.List;

public interface ClientService {

    ClientDTO save(ClientDTO clientDTO);
    void delete(long idCLient);

    List<ClientDTO> findAllClient();
    ClientDTO UpdateClient(long id, ClientDTO clientDTO);
}
