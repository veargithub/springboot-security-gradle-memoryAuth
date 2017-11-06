package com.vart.demo.dao;

import com.vart.demo.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface PersonDao extends CrudRepository<Person, Long>{

    public Person findByName(String name);

}
