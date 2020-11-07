package com.example.lesson28;

import java.util.ArrayList;
import java.util.Comparator;

public class TextUtils {

    public static void sortByLengthOld(ArrayList<String> array) {
        array.sort(new Comparator<String>() {

            // o1 > o2 1
            // o1 == o2 0
            // o1 < o2 -1

            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });
    }

    public static void sortByLength(ArrayList<String> array) {
        array.sort(
                (o1, o2) -> {
                    return Integer.compare(o1.length(), o2.length());
                }
        );
    }
    public static void sortByLengthNew(ArrayList<String> array) {
        array.sort(
                (o1, o2) -> Integer.compare(o1.length(), o2.length())
        );
    }
}
