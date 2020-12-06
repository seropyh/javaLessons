package com.example.MyTestHomeWrk;

public class MostLonglLneOne {
    public static int MaxLineOne(String str) {

        String myString = str;
        if (myString == null || myString.isBlank()) {
            return -1;
        } else {
            int maxLength = 0;
            int count = 0;
            for (int i = 0; i < myString.length(); i++) {
                var char1 = myString.charAt(i);
                if (char1 != '1' && char1 != '0') {
                      return -2;
                } else {

                    if (char1 == '1') {
                        count++;
                    } else {
                        if (count >= maxLength) maxLength = count;
                        count = 0;
                    }
                }

            }
            if (count >= maxLength) maxLength = count;
            return maxLength;
        }

    }
}
