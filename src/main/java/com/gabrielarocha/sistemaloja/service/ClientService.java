package com.gabrielarocha.sistemaloja.service;

import com.gabrielarocha.sistemaloja.SistemalojaApplication;
import com.gabrielarocha.sistemaloja.entities.Client;
import com.gabrielarocha.sistemaloja.service.interfaces.CrudService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService implements CrudService<Client> {

    @Override
    public Client create(Client client) {
        if (client.isValidClient()) {
            client.setId(System.currentTimeMillis());
            SistemalojaApplication.getClientSet().add(client);
            return client;
        }
        return null;
    }

    @Override
    public void remove(Integer id) {
        return;
    }

    @Override
    public Client findBy(String cpf) {
        return null;
    }

    @Override
    public List<Client> findAll() {
        return SistemalojaApplication.getClientSet().stream().collect(Collectors.toList());
    }
}
