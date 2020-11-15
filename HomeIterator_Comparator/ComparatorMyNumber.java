package com.example;

import java.util.Comparator;

public class ComparatorMyNumber implements Comparator<MyInteger> {
    @Override
    public int compare(MyInteger n1, MyInteger n2) {
        return n1.countDiv(n1.getMyInteger()).compareTo(n2.countDiv(n2.getMyInteger()));
    }

}

