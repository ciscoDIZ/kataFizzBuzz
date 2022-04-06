package com.leanmind.ciscoadiz.bizzbuzz;

public class Generator {

    public Text make(int number) {
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
    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
