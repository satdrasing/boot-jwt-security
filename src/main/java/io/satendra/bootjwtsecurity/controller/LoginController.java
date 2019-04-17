package io.satendra.bootjwtsecurity.controller;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/test")
    Collection<String> getNames(){

        return Arrays.asList("satendra","test name");
    }




}
