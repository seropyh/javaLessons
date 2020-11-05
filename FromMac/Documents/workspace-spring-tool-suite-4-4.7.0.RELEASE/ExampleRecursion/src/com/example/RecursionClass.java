package com.example;

import java.util.Scanner;

public class RecursionClass {

	public static int myRecFunc(int a) {
		if (a <= 0) {
			return 0;
		}
		if (a == 1) {
			return 1;
		} else
			return myRecFunc(a - 1) + myRecFunc(a - 2);

	}

	public static int myFactFunc(int a) {
		if (a <= 0) {
			return 1;
		}
		else
			return myFactFunc(a - 1) * a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		// System.out.println(myRecFunc(n));
		System.out.println(myFactFunc(n));

	}

}
