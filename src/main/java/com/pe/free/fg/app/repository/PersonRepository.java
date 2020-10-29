package com.pe.free.fg.app.repository;

import com.pe.free.fg.app.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {
}
