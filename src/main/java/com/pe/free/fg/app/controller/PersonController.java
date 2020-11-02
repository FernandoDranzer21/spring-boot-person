package com.pe.free.fg.app.controller;

import com.pe.free.fg.app.model.Person;
import com.pe.free.fg.app.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;


    @PostMapping(value = "/person",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> createPerson(@RequestBody @Valid Person person){
        Person p = personService.save(person);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @GetMapping(value = "/person/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable Long id) {

         Person p =  personService.findById(id);
          return new ResponseEntity<>(p,HttpStatus.OK);
    }
}
