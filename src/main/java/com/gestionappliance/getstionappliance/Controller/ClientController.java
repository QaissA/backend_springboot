package com.gestionappliance.getstionappliance.Controller;

import com.gestionappliance.getstionappliance.Dto.ClientDTO;
import com.gestionappliance.getstionappliance.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {

    @Autowired
    private ClientService clientService;


    @PostMapping("/add")
    public ClientDTO addClient(@RequestBody ClientDTO clientDTO) {
        return clientService.save(clientDTO);
    }

    @GetMapping("/all")
    public List<ClientDTO> getAllClient() {
        return clientService.findAllClient();
    }

    @DeleteMapping("delete/{id}")
    public void deleteClient(@PathVariable("id") Long idClient){
         clientService.delete(idClient);
    }

    @PutMapping("update/{id}")
    public ClientDTO updateClien(@PathVariable("id") Long id, @RequestBody ClientDTO clientDTO) {
        return clientService.UpdateClient(id, clientDTO);
    }

}
