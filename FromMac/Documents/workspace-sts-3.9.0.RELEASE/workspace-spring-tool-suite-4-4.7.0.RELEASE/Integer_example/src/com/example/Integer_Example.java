package com.example;

public class Integer_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var a = (byte) 127;
		Byte b = (byte) 2;
		System.out.println((byte) (a + b.byteValue()));
		var numberString = "100";
		// var number =Integer.parseInt(numberString);
		var number = Integer.parseInt(numberString, 8);
		var numberMyString = Integer.valueOf(number).toString();
		var numberMyString2 = Integer.valueOf(number).toOctalString(number);
		System.out.println(number);
		System.out.println(numberMyString2);
		//var number1 =(byte)127;
		var number1 =128;
		//var number2 =(short)number1;
		var number2 =(byte)number1;
		
		var decNumber = 136;
		var binNumber = 0b111;
		var hexNumber = 0xAA;
		var octNumber = 010;
		System.out.println(hexNumber);
		System.out.println(octNumber);
		;

	}

}
