
package com.tr.bluemoon.springdatajdbc.services.dependent.dao;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DependentRepository extends CrudRepository<Dependent, Integer> {

    List<Dependent> findAll();

    /*@Query("select name from client where id = :id ")
    String findClientById(@Param("id") Integer id);*/

    Optional<Dependent> findById(Integer id);
}