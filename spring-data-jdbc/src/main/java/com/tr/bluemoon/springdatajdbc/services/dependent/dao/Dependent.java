
package com.tr.bluemoon.springdatajdbc.services.dependent.dao;

import com.tr.bluemoon.springdatajdbc.services.client.dao.Client;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("dependent")
public class Dependent {

    @Id
    private Integer id;
    private String name;
    private Client client;

    public Dependent() {
    }

    public Dependent(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Dependent(Integer id, String name, Client client) {
        this.id = id;
        this.name = name;
        this.client = client;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Dependent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", client=" + client +
                '}';
    }
}