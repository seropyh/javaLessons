package com.example;

import java.util.Scanner;

public class DoubleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var a =1.000001d;
		var b = 0.000001d;
		var c = a-b;
	
		var scn = new Scanner(System.in);
		
		var d = scn.nextInt();
	;
		
	if (d<0)  System.out.println ("Вы ввели отрицательое число");
	 
	else if (d>0 && d>10 ) System.out.println (d); 
	
	System.out.println (d);
	 
	}


}
