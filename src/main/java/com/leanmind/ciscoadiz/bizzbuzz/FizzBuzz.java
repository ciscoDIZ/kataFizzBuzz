package com.leanmind.ciscoadiz.bizzbuzz;

import java.util.*;

public class FizzBuzz {

    public List<Text> buildFizzBuzz() {
        List<Text> result = new ArrayList<>();


        for (int i = 1; i <= 100; i++) {
            result.add(make(i));
        }
        return result;
    }

    private Text make(int number) {
            Text result = new Text(number);
            Text fizz = new Text("Fizz");
            if (isFizz(number)) {
                result = fizz;

            }

            if (isBuzz(number)) {
                Text buzz = new Text("Buzz");
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
