package com.example.lesson28;8package com.example.lesson28;
/*
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import static com.example.lesson28.Palindrom.isPalindrom;

@SpringBootApplication
*/
public class Lesson28Application implements CommandLineRunner {

//	public static void main(String[] args) {
//		SpringApplication.run(Lesson28Application.class, args);
	}

 //   @Override
//    public void run(String... args) throws Exception {
//        System.out.println("Hello, world");
//
//        System.out.println(isPalindrom(null));     // false
//        System.out.println(isPalindrom(""));       // false
//        System.out.println(isPalindrom(" "));      // false
//        System.out.println(isPalindrom("шалаш"));  // true
//        System.out.println(isPalindrom("123321")); // false
//        System.out.println(isPalindrom("урок"));   // false
//        System.out.println(isPalindrom("яя"));     // true
//        System.out.println(isPalindrom("батон"));  // false
//        System.out.println(isPalindrom("я"));      // true
//        System.out.println(isPalindrom("тОПоТ"));  // true

        var scanner = new Scanner(System.in);
        var array = new ArrayList<String>();

        String line = scanner.nextLine();
        while (!line.isEmpty()) {
            array.add(line);
            line = scanner.nextLine();
        }

        TextUtils.sortByLengthOld(array);

        for (var s : array) {
            System.out.println(s);
        }

    }
}
*/