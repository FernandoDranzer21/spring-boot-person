package com.pe.free.fg.app.service;

import com.pe.free.fg.app.model.Person;
import com.pe.free.fg.app.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }
}
