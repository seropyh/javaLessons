package com.palindrom;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		var arr = new int[8];
		for (var i = 0; i < 8; i++) {
			arr[i] = sc.nextInt();
		}
		for (var i = 0; i < arr.length / 2; i++) {
			int c;
			c = arr[i];
			arr[i] = arr[7 - i];
			arr[7 - i] = c;
		}

		for (var z : arr) {
			System.out.println(z);
		}

	}
}
