/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iosoup.auth_api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author nayem
 */
@Controller
public class HelloResource {
    
    @RequestMapping({ "/hello" })
    public String hello() {
        return "Hello World";
    }
}
