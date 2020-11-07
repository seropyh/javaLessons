package com.example;

import java.util.Scanner;

public class Factorial {
	
	public static final Integer VALUE_SUM = 0;

	public static void main(String[] args) {
		var scannerInput = new Scanner(System.in);
		
		var number = scannerInput.nextInt();
		var res = 1L;
		
		if (number > 20) {
			System.out.println("Слишком большое число");
		} else {
			for (var i = 1; i <= number; i = i + 1) {
				res = res * i;
			}
		}
		
		System.out.println(res);

	}

}
