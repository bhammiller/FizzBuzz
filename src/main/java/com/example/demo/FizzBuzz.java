package com.example.demo;
import java.util.Scanner;

public class FizzBuzz {
    public String fizzBuzzing(){
        String output;
        Integer counter7 = 0;
        Integer counter17 = 0;
        Integer counter23 = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the ending number");
        Integer end_number = keyboard.nextInt();
        output = "The ending number is "+ end_number;
        System.out.println(output);

        for (int x=1; x <= end_number; ++x) {
            if(x % 7 == 0 )
                counter7 += 1;
            if(x % 17 == 0 )
                counter17 += 1;
            if(x % 23 == 0 )
                counter23 += 1;
            if ((x % 3 == 0) && (x % 5 == 0))
                output += "<br/>" + "FizzBuzz";
             else if (x % 3 == 0)
                output += "<br/>" + "Fizz";
             else if (x % 5 == 0)
                output += "<br/>" + "Buzz";
             else
                output += "<br/>" + x;

        }
        output += "<br/>" + "The number of muliples of 7 is " + counter7
                + "<br/>The number of multiples of 17 is " + counter17
                + "<br/>The number of multiples of 23 is " + counter23;
        return output;

    }
}
