package com.projects.deploy_aws.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping
    public String sayHello() {
        return "Deixa o like!";
    }
}
