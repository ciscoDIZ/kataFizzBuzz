package com.leanmind.ciscoadiz.bizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> buildFizzBuzz() {
        List<String> fizzBuzzNumbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String number = (i+1)+"";

            if ((i+1) % 3 == 0) {
                number = "Fizz";
            }

            if ((i+1) % 5 == 0) {
                number = number.equals("Fizz") ? number+"Buzz" : "Buzz";
            }
            fizzBuzzNumbers.add(number);
        }
        return fizzBuzzNumbers;
    }
}
