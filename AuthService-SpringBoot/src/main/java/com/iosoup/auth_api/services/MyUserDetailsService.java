/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iosoup.auth_api.services;

import java.util.ArrayList;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author nayem
 */

@Service
public class MyUserDetailsService implements UserDetailsService{
    
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        return new User("foo", "foo", new ArrayList<>());
    }
    
}
