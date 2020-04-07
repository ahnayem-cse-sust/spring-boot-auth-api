/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iosoup.auth_api.api;

import com.iosoup.auth_api.model.Person;
import com.iosoup.auth_api.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nayem
 */

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    
    private final PersonService personService;
    
    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }
    
    @PostMapping
    public void addPerson(Person person){
        personService.addPerson(person);
    }
    
    @GetMapping
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }
}
