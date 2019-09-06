package com.service;

import com.model.entities.City;
import com.respo.CityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findByNameEndsWith(String name) {

        List<City> cities = (List<City>) repository.findByNameEndsWith(name);
        return cities;
    }
}
