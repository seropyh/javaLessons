package com.example;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		var arr = new int[] { 0, 1, 0, 1, 0 };

		arr[1] = 1;
		arr[2] = 1;

		for (var i = 0; i < 5; i++) {
			System.out.print(arr[i]);
		}
		
		System.out.print("\n=======\n");
		
		for (var i : arr) {
			System.out.print(i);
		}

		System.out.print("\n=======\n");

		var matrix = new int[][] { { 1, 2, 3, 4}, { 1, 2, 3}, { 1, 2 }, { 1} };

//		matrix[0][0] = 1;
//		matrix[1][1] = 1;
//		matrix[2][2] = 1;
//		matrix[3][3] = 1;

		for (var i = 0; i < matrix.length; i++) {
			for (var j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
		for (var array : matrix) {
			for (var elem : array) {
				elem = 5;
				System.out.print(elem);
			}
			System.out.println();
		}
		
		for (var i = 0; i < matrix.length; i++) {
			for (var j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

}
