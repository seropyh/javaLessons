package com.upgradecalc;

import java.util.Scanner;

public class UpgradeCalc {

    public static int myPow(int n1, int n2) {
        int result = n1;
        if (n2 == 0) {
            return 1;
        }
        for (int i = 1; i < n2; i++) {
            result = result * n1;
        }
        return result;

    }

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var action = "";
        var goodAction = true;
        System.out.println("Введите действие(/,+,-,*,^(второе чило целое),mod,div):");
        do {
            action = sc.next();
            goodAction = action.equals("/") || action.equals("+") || action.equals("-") || action.equals("*")
                    || action.equals("^") || action.equals("mod") || action.equals("div");

            if (!goodAction) {
                System.out.println("Неверное действие.\nВведите действие(/,+,-,*,^(второе число целое),mod,div)::");
            }

        }
        while (!goodAction);
        System.out.println("Введите первое число:");
        var number1 = 0;
        number1 = sc.nextInt();
        System.out.println("Введите второе число:");
        var number2 = 0;
        number2 = sc.nextInt();
        do {
            if (action.equals("/") && number2 == 0) {
                System.out.println("На ноль делить нельзя\nВведите второе число:");
                number2 = sc.nextInt();
            }
            if (action.equals("^") && number2 < 0) {
                System.out.println("Отрицательная степень!\nВведите второе число больше 0:");
                number2 = sc.nextInt();
            }
        }
        while ((action.equals("/") && number2 == 0) || (action.equals("^") && number2 < 0));
        var result = 0;
        switch (action) {
            case "/":
                result = number1 / number2;
                break;
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "^":
                result = myPow(number1, number2);
                break;
            case "mod":
                result = number1 % number2;
                break;
            case "div":
                result = number1 / number2;
                break;
            default:
        }

        System.out.println("Результат:");
        System.out.println(result);
    }

}
