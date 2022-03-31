package com.leanmind.ciscoadiz.bizzbuzz;

import java.util.*;

public class FizzBuzz {

    public List<Text> buildFizzBuzz() {
        List<Text> result = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Text number = new Text((i+1)+"");
            result.add(number);
        }
        return result;
    }
}
