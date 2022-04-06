package com.leanmind.ciscoadiz.bizzbuzz;

import java.util.*;

public class FizzBuzz {

    public List<Text> buildFizzBuzz() {
        var result = new ArrayList<Text>();

        for (int i = 1; i <= 100; i++) {
            result.add(make(i));
        }
        return result;
    }

    private Text make(int number) {
            var result = new Text(number);
            final Text fizz = new Text("Fizz");
            final Text buzz = new Text("Buzz");
            if (isFizz(number)) {
                result = fizz;
            }

            if (isBuzz(number)) {
                result = result.equals(fizz) ? result.concat(buzz) : buzz;
            }

            return result;
    }

    private boolean isBuzz(int i) {
        return i % 5 == 0;
    }

    private boolean isFizz(int i) {
        return i % 3 == 0;
    }
}
