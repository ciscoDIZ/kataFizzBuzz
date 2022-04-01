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
            Text fizz = new Text("Fizz");
            if (isFizz(i)) {
                number = fizz;
            }

            if (isBuzz(i)) {
                Text buzz = new Text("Buzz");
                number = number.equals(fizz) ? new Text(number.getValue()+buzz) : buzz;
            }
            result.add(number);
        }
    }

    private boolean isBuzz(int i) {
        return (i + 1) % 5 == 0;
    }

    private boolean isFizz(int i) {
        return (i + 1) % 3 == 0;
    }
}
