package com.example;
import java.util.*;

public class myIntegerMain {
    private static int countDiv(int n) {

        int count = 0;
        var f = 0;
        for (int i = 2; i <= n; i++) {
            var k = n % i;
            if (k == 0) {
                f = 0;
                for (int j = 2; j <= i - 1; j++) {
                    if (i % j == 0) {
                        f = 1;
                    }
                }
                if (f == 0) {
                    count++;
                }
            }
        }
        return count;
    }

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
    }
}