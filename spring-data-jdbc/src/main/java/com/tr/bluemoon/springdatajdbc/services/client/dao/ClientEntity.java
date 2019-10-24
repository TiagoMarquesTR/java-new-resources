
package com.tr.bluemoon.springdatajdbc.services.client.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("client")
public class ClientEntity {

    @Id
    private Integer id;
    private String name;

    public ClientEntity() {}

    public ClientEntity(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "ClientEntity [id=" + id + ", name=" + name + "]";
    }
    
}