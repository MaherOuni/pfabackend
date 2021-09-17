package com.pfa.labor.web.rest;

import com.pfa.labor.dao.entities.Client;
import com.pfa.labor.dto.ClientDTO;
import com.pfa.labor.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/client")
public class ClientRestController {
    @Autowired
    private IClientService service;

    @PostMapping("/add")
    public void createClient(@RequestBody ClientDTO Client){
        service.addClient(Client);
    }

    @PutMapping("/update")
    public void updateClient(@RequestBody Client Client){
        service.updateClient(Client);
    }

    @DeleteMapping("/delete/{idClient}")
    public void deleteClient(@PathVariable("idClient") Long id) {
        service.deleteClient(id);
    }
    @GetMapping("/all")
    public List<Client> getAll (){
        return service.getAll();
    }
}
