/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iosoup.auth_api.api;

import com.iosoup.auth_api.model.Person;
import com.iosoup.auth_api.service.PersonService;

/**
 *
 * @author nayem
 */
public class PersonController {
    
    private final PersonService personService;
    
    public PersonController(PersonService personService){
        this.personService = personService;
    }
    
    public void addPerson(Person person){
        personService.addPerson(person);
    }
}
