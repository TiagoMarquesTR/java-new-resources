package com.tr.bluemoon.springdatajdbc.services.client.dao;

import com.tr.bluemoon.springdatajdbc.dto.ClientDto;

public class ClientConverter {

	public ClientDto convertTo(Client client) {
		ClientDto price = new ClientDto();
		price.setId(client.getId());
		price.setName(client.getName());
		return price;
	}
	
	public Client convertTo(ClientDto dto) {
		Client client = new Client();
		client.setId(dto.getId());
		client.setName(dto.getName());
		return client;
	}
}