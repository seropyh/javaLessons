package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMyNumber<N> implements Iterator<MyInteger>, Iterable<MyInteger> {
    private ArrayList<MyInteger> myinteger;

    public ArrayList<MyInteger> getMyinteger() {
        return myinteger;
    }
    private int myPos;
    private int myPosition;
    public IteratorMyNumber(ArrayList<MyInteger> myinteger) {
        this.myinteger = myinteger;
        this.myPos = myinteger.size() - 1;
    }
    @Override
    public boolean hasNext() {

        for (int i = 0; i < myinteger.size(); i++) {
            myinteger.get(myPosition).mString(next().getMyInteger());
            System.out.println("");
        }
        return myPosition < myinteger.size();
    }

    @Override
    public MyInteger next() {
        return myinteger.get(myPosition++);
    }

    @Override
    public Iterator<MyInteger> iterator() {
        return this;
    }

}
