package com.leanmind.ciscoadiz.bizzbuzz;

import java.util.*;

public class FizzBuzz {

    public List<Text> buildFizzBuzz() {
        List<Text> result = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Text number = new Text((i+1)+"");
            if ((i+1) % 3 == 0) {
                number = new Text("Fizz");
            }
            result.add(number);
        }
        return result;
    }
}
