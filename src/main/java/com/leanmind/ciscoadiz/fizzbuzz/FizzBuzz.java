package com.leanmind.ciscoadiz.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> buildFizzBuzz() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String number = (i+1)+"";
            if ((i+1) % 3 == 0) {
                number = "Fizz";
            }
            if((i+1) % 5 == 0) {
                number = "Buzz";
            }
            if ((i+1) % 5 == 0 && (i+1) % 3 == 0) {
                number = "FizzBuzz";
            }
            result.add(number);
        }
        return result;
    }
}
