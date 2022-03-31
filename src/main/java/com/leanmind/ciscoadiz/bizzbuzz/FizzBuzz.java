package com.leanmind.ciscoadiz.bizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> buildFizzBuzz() {
        List<String> fizzBuzzNumbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            fizzBuzzNumbers.add((i + 1) + "");
        }
        return fizzBuzzNumbers;
    }
}
