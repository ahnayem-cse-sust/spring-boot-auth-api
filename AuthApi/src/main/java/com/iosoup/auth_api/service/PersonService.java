/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iosoup.auth_api.service;

import com.iosoup.auth_api.dao.PersonDao;
import com.iosoup.auth_api.model.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author nayem
 */
@Service
public class PersonService {
    
    private final PersonDao personDao;
    
    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao){
        this.personDao = personDao;
    }
     
    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
    
    public List<Person> getAllPeople() {
        return personDao.selectAllPeople();
    }
}
