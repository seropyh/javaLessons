package com.example.MyTestHomeWrk;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.MyTestHomeWrk.MostLonglLneOne.MaxLineOne;

@SpringBootApplication
public class MyTestHomeWrkApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MyTestHomeWrkApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
  /*      System.out.println("Hello World");
        System.out.println(isPalindrom("шалаш")); //true
        System.out.println(isPalindrom("123321"));//false
        System.out.println(isPalindrom(null));//false
        System.out.println(isPalindrom(""));//false
        System.out.println(isPalindrom(" "));//false
        System.out.println(isPalindrom("яя"));//true
        System.out.println(isPalindrom("батон"));//false
        System.out.println(isPalindrom("я"));//true
        System.out.println(isPalindrom("тоПоТ"));//true

   */
    //    int myLength = MaxLineOne("1000110001111011111000");
        int myLength = MaxLineOne("01001111");
        if (myLength <0)  {
            System.out.println("Неверная строка");
            return;
        }
        System.out.println(myLength);
    }


}
