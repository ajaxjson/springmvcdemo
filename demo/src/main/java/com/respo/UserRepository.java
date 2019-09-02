package com.respo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	//Page<City> findAll(Pageable pageable);

	User findByName(String firstname, String lastname);
	
	//User findAll();
}

