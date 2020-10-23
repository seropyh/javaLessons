package com.example;

import java.util.Scanner;

public class TextinBorder {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.println("Введите длину");
        var length = sc.nextInt();

        System.out.println("Введите ширину");
        var width = sc.nextInt();

        System.out.println("Введите строку");
        var myStr = sc.next();
        if (myStr.length() > width - 2 || length <= 2) {
            System.out.println("Ошибка");
            return;
        }
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= width; j++) {

                if (i == 1 || j == 1 || i == length || j == width) {
                    System.out.print('*');
                } else if (j == (width - myStr.length()) / 2 + 1 && i == Math.ceil(length / 2.0)) {

                    System.out.print(myStr);
                    j += myStr.length() - 1;
                } else {

                    System.out.print(' ');
                }
            }

            System.out.println();
        }

    }

}
