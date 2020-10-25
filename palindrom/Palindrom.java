package com.palindrom;

public class Palindrom {
	
	public static boolean recPalindrom(String pal) {
		if (pal.length() <= 1)
			return true;
		if (pal.charAt(0) != pal.charAt(pal.length() - 1))
			return false;
		return recPalindrom(pal.substring(1, pal.length() - 1));
	}

	public static void main(String[] args) {
		String a = "арозаупаланалапуазора";

		if (recPalindrom(a))
			System.out.println("Палиндром");
		else
			System.out.println("Не палиндром");
	}

}
