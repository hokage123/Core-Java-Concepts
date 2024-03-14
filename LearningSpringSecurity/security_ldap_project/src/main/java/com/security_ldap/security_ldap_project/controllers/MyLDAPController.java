package com.security_ldap.security_ldap_project.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyLDAPController {

    @GetMapping("/")
    public String index() {
        return "Welcome to the home page!";
    }
    @GetMapping("/login")
    public String loginEndpoint()
    {
        return "Login!";
    }

}
