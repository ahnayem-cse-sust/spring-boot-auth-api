/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iosoup.auth_api.service;

import com.iosoup.auth_api.dao.PersonDao;
import com.iosoup.auth_api.model.Person;

/**
 *
 * @author nayem
 */
public class PersonService {
    
    private final PersonDao personDao;
    
    public PersonService(PersonDao personDao){
        this.personDao = personDao;
    }
     
    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
