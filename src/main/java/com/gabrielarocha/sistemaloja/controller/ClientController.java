package com.gabrielarocha.sistemaloja.controller;

import com.gabrielarocha.sistemaloja.dtos.ClientDTO;
import com.gabrielarocha.sistemaloja.entities.Client;
import com.gabrielarocha.sistemaloja.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;


    @PostMapping(value = "")
    public ResponseEntity<Client> create(@RequestBody ClientDTO clientDTO) {
        try{
            return ResponseEntity.ok().body(clientService.create(clientDTO.converter()));
        } catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body(null);
        }
    }

    @GetMapping(value = "")
    public ResponseEntity<List<Client>> findAll() {
        try{
            return ResponseEntity.ok().body(clientService.findAll());
        } catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body(null);
        }
    }
}
