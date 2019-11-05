
package com.tr.bluemoon.springdatajdbc.services.client.dao;

import com.tr.bluemoon.springdatajdbc.services.dependent.dao.Dependent;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("client")
public class Client {

    @Id
    private Integer id;
    private String name;
    private Dependent dependent;
    
    public Client() {
    }

    public Client(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Client(Integer id, String name, Dependent dependent) {
        this.id = id;
        this.name = name;
        this.dependent = dependent;
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

    public Dependent getDependent() {
        return dependent;
    }

    public void setDependent(Dependent dependent) {
        this.dependent = dependent;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dependent=" + dependent +
                '}';
    }
}