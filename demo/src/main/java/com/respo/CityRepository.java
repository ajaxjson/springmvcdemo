package com.respo;

import com.model.entities.City;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

    @Query("select c from City c where c.name like %?1")
    List<City> findByNameEndsWith(String chars);
}
