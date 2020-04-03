/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iosoup.auth_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author nayem
 */
@SpringBootApplication
public class HelloControllerWar extends SpringBootServletInitializer{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HelloControllerWar.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(HelloControllerWar.class, args);
    }
    
    @RequestMapping(value = "/")
    public String hello() {
        return "Hello World from Tomcat";
    }
}
