/*
package com.tr.bluemoon.springdatajdbc.services.dependent.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DependentDao {

    private DependentRepository dependentRepository;

    public DependentDao(DependentRepository dependentRepository) {
        this.dependentRepository = dependentRepository;
    }

    public List<Dependent> getAll() {
        return dependentRepository.findAll().stream().collect(Collectors.toList());

    }

    public Optional<Dependent> getById(Integer id) {
        return dependentRepository.findById(id);
    }

    public void save(Dependent dependent) {
        dependentRepository.save(dependent);
    }

    public void update(Dependent updatDependent) {
        if (updatDependent.getId() == null) {
            return;
        }

        if (!dependentRepository.existsById(updatDependent.getId())) {
            return;
        }

        dependentRepository.save(updatDependent);
    }

}*/