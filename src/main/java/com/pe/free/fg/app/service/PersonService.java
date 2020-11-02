package com.pe.free.fg.app.service;

import com.pe.free.fg.app.model.Person;

public interface PersonService {

    Person save(Person person);

    Person findById(Long id);
}
