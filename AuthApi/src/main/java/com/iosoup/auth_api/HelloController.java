/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iosoup.auth_api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nayem
 */

@SpringBootApplication
@RestController
public class HelloController {
    
    @RequestMapping(value = "/")
    public String hello(){
        return "Hello World Application!!";
    }
}
