package io.satendra.bootjwtsecurity.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collection;

@RestController
public class LoginController {

    @GetMapping("/")
    Collection<String> getNames(){

        return Arrays.asList("satendra","test name");
    }

}
