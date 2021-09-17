package com.pfa.labor.service;

import com.pfa.labor.dao.entities.Client;
import com.pfa.labor.dto.ClientDTO;

import java.util.List;

public interface IClientService {
    void addClient(ClientDTO Client);

    void updateClient(Client Client);

    void deleteClient(Long id);

    List<Client> getAll();
}
