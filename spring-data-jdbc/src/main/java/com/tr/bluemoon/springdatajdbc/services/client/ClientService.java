
package com.tr.bluemoon.springdatajdbc.services.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import com.tr.bluemoon.springdatajdbc.services.client.dao.ClientDao;
import com.tr.bluemoon.springdatajdbc.dto.ClientDto;

@Component
public class ClientService {

	@Autowired
	private ClientDao clientDAO;

	public List<ClientDto> getAll() {
		List<ClientDto> clients = clientDAO.getAll();
		return clients;
	}

	public List<ClientDto> getByName(String name) {
		List<ClientDto> clients = clientDAO.getByName(name);
		return clients;
	}

	public void save(ClientDto clientDto) {
		clientDAO.save(clientDto);
	}

	public void update(ClientDto clientDto) {
		clientDAO.update(clientDto);
	}

}