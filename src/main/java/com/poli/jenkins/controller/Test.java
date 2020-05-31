package com.poli.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/")
    public String hola() {
        return "Hi Ronal this is a test.";
    }

    @GetMapping("/hola")
    public String holitas() {
        return "Holitas";
    }

}
