package com.example;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);

		var countOfNum = 8;

		var arr = new int[countOfNum];
		var arr2 = new int[countOfNum];

		var check = new int[countOfNum];
		var check2 = new int[countOfNum];

		System.out.println("Введите первый массив");

		for (var i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Введите второй массив");

		for (var i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		for (var i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2.length; i++) {
				if ( arr[i] == arr2[j] ) {
					check[i]++;
					break;
				}
			}

		}

	}

}
