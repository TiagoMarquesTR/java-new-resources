
package com.tr.bluemoon.springdatajdbc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.tr.bluemoon.springdatajdbc.services.client.ClientService;
import com.tr.bluemoon.springdatajdbc.dto.ClientDto;
import com.tr.bluemoon.springdatajdbc.dto.ClientForm;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;
    
    @GetMapping
    public List<ClientDto> get() {
        List<ClientDto> clients = clientService.getAll();
        return clients;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<String> add(@RequestBody @Valid ClientForm form, UriComponentsBuilder uriBuilder) {
        clientService.save(form);

        return ResponseEntity.ok("OK");
    }

    @PutMapping
    @Transactional
    public ResponseEntity<String> add(@RequestBody @Valid ClientDto form, UriComponentsBuilder uriBuilder) {
        clientService.update(form);

        return ResponseEntity.ok("OK");
    } 
}