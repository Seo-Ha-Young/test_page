package org.example.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
public class testController {

    @GetMapping("/word")
    public String test() {
        String hello = "Hello, World!!";
        return hello;
    }


}
