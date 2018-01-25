package com.example.demo;

public class FizzBuzz {
    public String fizzBuzzing(){
        String output ="";
        Integer x = 1;
        while (x <= 100) {
           // if ((x % 3 == 0) && )
            output = output + "<br/>" + x;
            ++x;
        }
        return output;

    }
}
