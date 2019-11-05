/*

package com.tr.bluemoon.springdatajdbc.services.client;

import com.tr.bluemoon.springdatajdbc.services.client.dao.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import com.tr.bluemoon.springdatajdbc.services.client.dao.ClientDao;

@Component
public class ClientService {

	@Autowired
	private ClientDao clientDAO;

	public List<Client> getAll() {
		List<Client> clients = clientDAO.getAll();
		return clients;
	}

	public List<Client> getByName(String name) {
		List<Client> clients = clientDAO.getByName(name);
		return clients;
	}

	public void save(Client client) {
		clientDAO.save(client);
	}

	public void update(Client client) {
		clientDAO.update(client);
	}

}*/
