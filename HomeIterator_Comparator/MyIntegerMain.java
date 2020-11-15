package com.example;

import java.util.*;

public class MyIntegerMain {
    public static void main(String[] args) {
        MyInteger num1 = new MyInteger(256);
        MyInteger num2 = new MyInteger(1359);
        MyInteger num3 = new MyInteger(234);
        MyInteger num4 = new MyInteger(456);
        var collNumber = new TreeSet<MyInteger>();
        collNumber.add(num1);
        collNumber.add(num2);
        collNumber.add(num3);
        collNumber.add(num4);
        for (MyInteger i : collNumber) {
            System.out.println(i);
        }
        //Переворачиваем числа
        ArrayList<MyInteger> stateInteg = new ArrayList<MyInteger>();
        ListIterator li = stateInteg.listIterator(stateInteg.size());

        stateInteg.add(new MyInteger(850));
        stateInteg.add(new MyInteger(467890));
        stateInteg.add(new MyInteger(987654321));
        stateInteg.add(new MyInteger(1234567));

        for (MyInteger s : new IteratorMyNumber<MyInteger>(stateInteg)) {
            System.out.println(s);
        }


    }
}