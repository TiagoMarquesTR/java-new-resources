package com.tr.bluemoon.springdatajdbc.services.client.dao;

import com.tr.bluemoon.springdatajdbc.dto.ClientDto;
import com.tr.bluemoon.springdatajdbc.dto.ClientForm;

public class ClientConverter {

	public ClientDto convertTo(ClientEntity entity) {
		ClientDto price = new ClientDto();
		price.setId(entity.getId());
		price.setName(entity.getName());
		return price;
	}
	
	public ClientEntity convertTo(ClientDto dto) {
		ClientEntity entity = new ClientEntity();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		return entity;
	}

	public ClientEntity convertTo(ClientForm form) {
		ClientEntity entity = new ClientEntity();
		entity.setName(form.getName());
		return entity;
	}  	
}