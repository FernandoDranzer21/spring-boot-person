package com.pe.free.fg.app;

import com.pe.free.fg.app.controller.PersonController;
import com.pe.free.fg.app.model.Person;
import com.pe.free.fg.app.service.PersonService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class PersonControllerTest {

    private static final Person PERSON = new Person();
    private static final Long ID_PERSON=1L;


    @Mock
    PersonService personService;

    @InjectMocks
    PersonController personController;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        PERSON.setName("Goku");
        PERSON.setAge(22L);
    }


    @Test
    public void createPerson(){
        Mockito.when(personService.save(PERSON)).thenReturn(PERSON);
        ResponseEntity<Person> responseEntity = personController.createPerson(PERSON);
        Assert.assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
    }

    @Test
    public void getPerson(){
        Mockito.when(personService.findById(ID_PERSON)).thenReturn(PERSON);
        ResponseEntity<Person> responseEntity = personController.getPerson(ID_PERSON);
        Assert.assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);

    }
}
