
package com.tr.bluemoon.springdatajdbc.services.dependent.dao;

import com.tr.bluemoon.springdatajdbc.services.client.dao.Client;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("dependent")
public class Dependent {

    @Id
    private Integer id;
    //TODO: Spring Data JDBC don't work well with FK.
    @Column("id")
    private Client client;
    private String name;

    public Dependent() {
    }

    public Dependent(Integer id, Client client, String name) {
        this.id = id;
        this.client = client;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}