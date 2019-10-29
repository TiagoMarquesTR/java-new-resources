
package com.tr.bluemoon.springdatajdbc.services.dependent;

import com.tr.bluemoon.springdatajdbc.services.dependent.dao.Dependent;
import com.tr.bluemoon.springdatajdbc.services.dependent.dao.DependentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DependentService {

    @Autowired
    private DependentDao dependentDao;

    public List<Dependent> getAll() {
        List<Dependent> dependents = dependentDao.getAll();
        return dependents;
    }

    public Optional<Dependent> getById(Integer id) {
        Optional<Dependent> dependent = dependentDao.getById(id);
        return dependent;
    }

    public void save(Dependent dependent) {
        dependentDao.save(dependent);
    }

    public void update(Dependent dependent) {
        dependentDao.update(dependent);
    }

}