package com.leanmind.ciscoadiz.bizzbuzz;

import java.util.*;

public class FizzBuzz {

    public List<Text> buildFizzBuzz() {
        var result = new ArrayList<Text>();
        Generator generator = new Generator();
        for (int i = 1; i <= 100; i++) {
            result.add(generator.make(i));
        }
        return result;
    }

}
