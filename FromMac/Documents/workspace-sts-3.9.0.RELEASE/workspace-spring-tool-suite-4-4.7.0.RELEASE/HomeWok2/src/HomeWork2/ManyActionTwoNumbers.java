package HomeWork2;

import java.util.Scanner;

public class ManyActionTwoNumbers {

	public static void main(String[] args) {
		
		var scn = new Scanner(System.in);

		var a = scn.nextDouble();
		var b = scn.nextDouble();
		var c = a - b;
		System.out.println("Разность:" + c);
		System.out.println("Умножение:" + a * b);
		System.out.println("Деление:");
		if (b==0) System.out.println("На ноль делить нельзя");
		else {System.out.println(a/b);
			 System.out.println("Целочисленное деление:" + a%b);
		}
		System.out.println("Сложение:" + (a + b));
		
 

	}

}
