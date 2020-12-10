package com.example.demo.controller;

import com.example.demo.domain.Cliente;
import com.example.demo.service.ClientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientController {

    public ClientService client;

    public ClientController(ClientService ClientService){
        this.client = ClientService;
    }

    public List<Cliente> listAll(){
        return this.client.listAll();
    }

}
