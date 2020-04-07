/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iosoup.auth_api.dao;

import com.iosoup.auth_api.model.Person;
import java.util.UUID;

/**
 *
 * @author nayem
 */
public interface PersonDao {
    
    int insertPerson(UUID id, Person person);
    
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
