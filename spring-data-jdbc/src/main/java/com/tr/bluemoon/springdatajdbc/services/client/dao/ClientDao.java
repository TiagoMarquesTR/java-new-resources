
package com.tr.bluemoon.springdatajdbc.services.client.dao;

import java.util.List;
import java.util.stream.Collectors;
import com.tr.bluemoon.springdatajdbc.dto.ClientDto;

public class ClientDao {

    private ClientRepository clientRepository;
    private ClientConverter clientConverter;

    public ClientDao(ClientRepository clientRepository, ClientConverter clientConverter) {
        this.clientRepository = clientRepository;
        this.clientConverter = clientConverter;
	}
	
	public List<ClientDto> getAll() {		
		return clientRepository.findAll().stream()
				.map(entity -> clientConverter.convertTo(entity))
				.collect(Collectors.toList());

	}

	public List<ClientDto> getByName(String name) {		
		return clientRepository.findByName(name).stream()
				.map(entity -> clientConverter.convertTo(entity))
				.collect(Collectors.toList());

	}

	public void save(ClientDto clientDto) {
		clientRepository.save(clientConverter.convertTo(clientDto));
	}

	public void update(ClientDto updatedClientModel) {
		if(updatedClientModel.getId() == null) {
			return;
		}
		
		if(!clientRepository.existsById(updatedClientModel.getId())) {
			return;
		}
		
		clientRepository.save(clientConverter.convertTo(updatedClientModel));
	}
	
}