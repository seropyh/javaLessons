package com.example;

public class MyInteger implements Comparable<MyInteger> {


    private Integer myinteger;
    public Integer getMyInteger(){
        return this.myinteger;
    }
    @Override
    public String toString() {
        return "MyInteger{" +
                "myinteger=" + myinteger +
                '}';
    }
    @Override
    public int compareTo(MyInteger n) {
        return countDiv(this.myinteger).compareTo(countDiv(n.myinteger));

    }

    public void setMyinteger(Integer myinteger) {
        this.myinteger = myinteger;
    }

    public int getMyinteger() {
        return myinteger;
    }

    public MyInteger(Integer myinteger) {
        this.myinteger = myinteger;
    }

    public boolean  mString(Integer myInt) {
        int i = 0;
        char[] myArray = ("" + myInt).toCharArray();
        for (i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] );
        }


        return i < myArray.length;
    }


    public Integer countDiv(Integer n) {

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
}
