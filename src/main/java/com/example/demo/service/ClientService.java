package com.example.demo.service;

import com.example.demo.domain.Cliente;
import com.example.demo.repository.Clientes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final Clientes clientRepository;

    public ClientService(Clientes clientRepository){
        this.clientRepository = clientRepository;
    }

    public List<Cliente> listAll(){
        return clientRepository.findAll();
    }

}
