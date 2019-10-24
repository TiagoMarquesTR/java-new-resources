
package com.tr.bluemoon.springdatajdbc.services.client.dao;

import java.util.List;

import com.tr.bluemoon.springdatajdbc.services.client.dao.ClientEntity;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<ClientEntity, Integer>{

    List<ClientEntity> findAll();
}