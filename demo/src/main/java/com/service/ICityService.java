package com.service;

import com.model.entities.City;
import java.util.List;

public interface ICityService {

    List<City> findByNameEndsWith(String name);
}
