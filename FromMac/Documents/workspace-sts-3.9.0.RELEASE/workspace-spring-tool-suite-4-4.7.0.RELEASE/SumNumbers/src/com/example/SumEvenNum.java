package com.example;

import java.util.Scanner;

public class SumEvenNum {

	public static int mySum(int pSum, int pKrat) {
		var a = 0;
		for (int i = 0; i <= pSum; i+=pKrat) {
			a += i;
		}
		return a;
	}

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var m = mySum(n, 2);
		System.out.println(m);

	}

}
