package com.pe.free.fg.app.controller;

import com.pe.free.fg.app.model.Person;
import com.pe.free.fg.app.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;


    @PostMapping(value = "/person",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Person createPerson(@RequestBody @Valid Person person){
        return personService.save(person);
    }
}
