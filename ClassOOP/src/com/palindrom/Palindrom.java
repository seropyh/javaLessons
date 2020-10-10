package com.palindrom;

public class Palindrom {
	
	public static int recPalindrom(String pal) {
		if (pal.length() <= 1)
			return 1;
		if (pal.charAt(0) != pal.charAt(pal.length() - 1))
			return 0;
		return recPalindrom(pal.substring(1, pal.length() - 1));
	}

	public static void main(String[] args) {
		String a = "арозаупаланалапуазора";

		if (recPalindrom(a) == 1)
			System.out.println("Палиндром");
		else
			System.out.println("Не палиндром");
	}

}
