package com.leanmind.ciscoadiz.bizzbuzz;

import java.util.Objects;

public class Text implements Comparable<String> {
    private final String value;

    public Text(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Text)) return false;
        Text text = (Text) o;
        return Objects.equals(value, text.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public int compareTo(String s) {
        if (s.equals(value)){
            return 0;
        }
        if (s.charAt(0) > value.charAt(0)){
            return -1;
        }
        return 1;
    }

    @Override
    public String toString() {
        return value;
    }
}
