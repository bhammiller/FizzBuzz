package com.example.demo;

public class FizzBuzz {
    public String fizzBuzzing(){
        String output ="";
        for (int x=1; x <= 100; ++x) {
            if ((x % 3 == 0) && (x % 5 == 0)) {
                output += "<br/>" + "FizzBuzz";
            } else if (x % 3 == 0) {
                output += "<br/>" + "Fizz";
            } else if (x % 5 == 0) {
                output += "<br/>" + "Buzz";
            } else {
                output += "<br/>" + x;
            }
        }
        return output;

    }
}
