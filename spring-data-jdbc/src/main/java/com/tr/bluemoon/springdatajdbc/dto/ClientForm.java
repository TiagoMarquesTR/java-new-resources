package com.tr.bluemoon.springdatajdbc.dto;

import com.tr.bluemoon.springdatajdbc.services.client.dao.ClientEntity;

public class ClientForm {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientEntity converter() {
        return new ClientEntity(name);
    }
}