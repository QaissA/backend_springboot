package com.gestionappliance.getstionappliance.Service.ServiceImp;

import com.gestionappliance.getstionappliance.Dto.ClientDTO;
import com.gestionappliance.getstionappliance.Mapping.ClientMapper;
import com.gestionappliance.getstionappliance.Model.Client;
import com.gestionappliance.getstionappliance.Repository.ClientRepo;
import com.gestionappliance.getstionappliance.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImp implements ClientService {

    @Autowired
    ClientRepo clientRepo;

    @Autowired
    ClientMapper clientMapper;
   
    @Override
    public ClientDTO save(ClientDTO clientDTO) {

        return clientMapper.clientToClientDTO(clientRepo.save(clientMapper.clientDTOToClient(clientDTO)));
    }

    @Override
    public void delete(long idCLient) {
        boolean exists = clientRepo.existsById(idCLient);
        if(!exists) {
            throw  new IllegalStateException("Client  does  not exists");
        }

        clientRepo.deleteById(idCLient);

    }

    @Override
    public List<ClientDTO> findAllClient() {
        return clientMapper.ClientsToClientDTOs(clientRepo.findAll());
    }

    @Override
    public ClientDTO UpdateClient(long id, ClientDTO clientDTO) {
        boolean exists = clientRepo.existsById(id);
        if(!exists) {
            throw new  IllegalStateException("client does not exists");
        }

//        clientDTO.setIdClient(id);
        clientRepo.save(clientMapper.clientDTOToClient(clientDTO));
        return null;
    }
}
