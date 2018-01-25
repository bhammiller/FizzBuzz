package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping ("/")
    public String fizz_buzzer(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        return fizzbuzz.fizzBuzzing();

    }
}
