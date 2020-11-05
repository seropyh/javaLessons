package com.example;
import java.util.Scanner;
public class MyInteger {
 private int myinteger;

    @Override
    public String toString() {
        return "MyInteger{" +
                "myinteger=" + myinteger +
                '}';
    }

    public void setMyinteger(int myinteger) {
        this.myinteger = myinteger;
    }

    public int getMyinteger() {
        return myinteger;
    }

    public MyInteger(int myinteger) {
        this.myinteger = myinteger;
    }
}
