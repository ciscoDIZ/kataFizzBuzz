package com.leanmind.ciscoadiz.bizzbuzz;

import java.util.*;

public class FizzBuzz {

    public List<Text> buildFizzBuzz() {
        List<Text> result = new ArrayList<>();

        make(result);
        return result;
    }

    private void make(List<Text> result) {
        for (int i = 0; i < 100; i++) {
            Text number = new Text((i+1)+"");
            if ((i+1) % 3 == 0) {
                number = new Text("Fizz");
            }

            if ((i+1) % 5 == 0) {
                number = number.equals(new Text("Fizz")) ?
                        new Text(number.getValue()+"Buzz") : new Text("Buzz");
            }
            result.add(number);
        }
    }
}
