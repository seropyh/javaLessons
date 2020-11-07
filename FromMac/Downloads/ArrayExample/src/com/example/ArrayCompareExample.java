package com.example;

import java.util.Scanner;

public class ArrayCompareExample {

	public static void main(String[] args) {
		var array1 = new int[8];
		var array2 = new int[8];
		
		var scanner = new Scanner(System.in);
		
		for (var i = 0; i < 8;i++) {
			array1[i] = scanner.nextInt();
		}
		for (var j = 0 ; j < 8;j++) {
			array2[j] = scanner.nextInt();
		}
		
		var count = 0;
		for (var i = 0; i < 8; i++) {
			for (var j = 0; j < 8; j++) {
				if (array1[i] == array2[j]) {
					count++;
					array2[j] = 0;
					break;
				}
			}
		}
		
		if (count == 8) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}

	}

}
