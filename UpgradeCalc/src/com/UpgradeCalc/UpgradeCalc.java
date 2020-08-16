package com.UpgradeCalc;

import java.util.Scanner;

public class UpgradeCalc {

	public static double myPow(double n1, long n2) {
		double result = n1;
		if (n2 == 0)
			return 1;
		result = n1;
		for (int i = 1; i < n2; i++) {
			result = result * n1;
		}
		return result;
	}

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var action = "";
		var number1 = 0d;
		var number2 = 0d;
		var result = 0d;
		var goodAction = true;
		System.out.println("Введите действие(/,+,-,*,^(второе чило целое),mod,div):");
		do {
			action = sc.next();
			goodAction = action.equals("/") || action.equals("+") || action.equals("-") || action.equals("*")
					|| action.equals("^") || action.equals("mod") || action.equals("div");

			if (!goodAction) {
				System.out.println("Неверное действие.\nВведите действие(/,+,-,*,^(второе число целое),mod,div)::");
			}

		} while (!goodAction);
		System.out.println("Введите первое число:");
		number1 = sc.nextDouble();

		System.out.println("Введите второе число:");
		number2 = sc.nextDouble();
		do {
			if (action.equals("/") && number2 == 0) {
				System.out.println("На ноль делить нельзя\nВведите второе число:");
				number2 = sc.nextDouble();
			}
		} while (number2 == 0.0);

		if (action.equals("/")) {
			result = number1 / number2;

		} else if (action.equals("+")) {
			result = number1 + number2;

		} else if (action.equals("-")) {
			result = number1 - number2;

		} else if (action.equals("*")) {
			result = number1 * number2;

		} else if (action.equals("^")) {
			result = myPow(number1, (long) number2);
			System.out.println(result);

		} else if (action.equals("mod")) {
			result = number1 % number2;

		} else if (action.equals("div")) {
			result = (long) number1 / (long) number2;
		}
		System.out.println("Результат:");
		System.out.println(result);

	}

}
