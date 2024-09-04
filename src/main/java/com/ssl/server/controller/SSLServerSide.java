package com.ssl.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Owner
 */
@RestController
public class SSLServerSide {
    
    @RequestMapping(value = "/server/test", method = RequestMethod.GET)
    public String testMe()
    {
        System.out.println("In here");
        return "Hello World Get response";
    }
    
    @RequestMapping(value = "/server/test", method = RequestMethod.POST)
    public String postMe()
    {
        return "Hello World Post response";
    }
}
