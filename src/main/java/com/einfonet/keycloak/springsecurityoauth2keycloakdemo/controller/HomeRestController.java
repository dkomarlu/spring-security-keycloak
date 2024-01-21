package com.einfonet.keycloak.springsecurityoauth2keycloakdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomeRestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello...";
    }
}
