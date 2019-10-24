
package com.tr.bluemoon.springdatajdbc.services.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import com.tr.bluemoon.springdatajdbc.services.client.dao.ClientDao;
import com.tr.bluemoon.springdatajdbc.dto.ClientDto;
import com.tr.bluemoon.springdatajdbc.dto.ClientForm;

@Component
public class ClientService {

	@Autowired
	private ClientDao clientDAO;

	public List<ClientDto> getAll() {
		List<ClientDto> clients = clientDAO.getAll();
		return clients;
	}

	public void save(ClientForm clientForm) {
		clientDAO.save(clientForm);
	}

	public void update(ClientDto clientDto) {
		clientDAO.update(clientDto);
	}

}