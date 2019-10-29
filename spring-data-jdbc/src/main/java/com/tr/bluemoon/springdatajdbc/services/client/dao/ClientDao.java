
package com.tr.bluemoon.springdatajdbc.services.client.dao;

import java.util.List;
import java.util.stream.Collectors;

public class ClientDao {

    private ClientRepository clientRepository;

    public ClientDao(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
	}
	
	public List<Client> getAll() {
		return clientRepository.findAll().stream().collect(Collectors.toList());

	}

	public List<Client> getByName(String name) {
		return clientRepository.findByName(name).stream().collect(Collectors.toList());

	}

	public void save(Client client) {
		clientRepository.save(client);
	}

	public void update(Client updatedclientmodel) {
		if(updatedclientmodel.getId() == null) {
			return;
		}
		
		if(!clientRepository.existsById(updatedclientmodel.getId())) {
			return;
		}
		
		clientRepository.save(updatedclientmodel);
	}
	
}